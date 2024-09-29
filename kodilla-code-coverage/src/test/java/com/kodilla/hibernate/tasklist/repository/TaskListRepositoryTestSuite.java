package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Description test";
    private int taskListId;

    @Test
    void testTaskListRepositoryFindByListName() {
        List<TaskList> readOfTaskListBefore = taskListRepository.findByListName("TEST_LIST_NAME");

        TaskList taskList = new TaskList("TEST_LIST_NAME", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();
        taskListId = taskList.getId();

        List<TaskList> readOfTaskListAfter = taskListRepository.findByListName(listName);

        assertEquals(readOfTaskListBefore.size() + 1, readOfTaskListAfter.size());
        assertEquals("TEST_LIST_NAME",readOfTaskListAfter.get(0).getListName());
    }

    @AfterEach
    void cleanUp() {
        if (taskListId != 0) {
            taskListRepository.deleteById(taskListId);
        }
    }
}