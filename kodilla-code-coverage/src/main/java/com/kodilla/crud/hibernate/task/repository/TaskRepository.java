package com.kodilla.crud.hibernate.task.repository;

import com.kodilla.crud.hibernate.task.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
