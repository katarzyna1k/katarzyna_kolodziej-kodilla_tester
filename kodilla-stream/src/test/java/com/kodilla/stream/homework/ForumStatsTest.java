package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void testAveragePostsForUsersOverAge() {
        List<User> users = new ArrayList<>();
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        users.add(new User("Test User1", 40, 3, "Test Group1"));
        users.add(new User("Test USer2", 39, 0, "Test Group2"));

        double usersResult = ForumStats.averagePostsForUsersOverAge(users);
        double delta = 0.01;
        assertEquals(1.66, usersResult, delta);
    }

    @Test
    public void testAveragePostsForUsersUnderAge() {
        List<User>users=new ArrayList<>();
        users.add(new User("Test User1", 40, 3, "Test Group1"));
        users.add(new User("Test USer2", 39, 0, "Test Group2"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Test User3", 0, 3, "Test Group3"));

        double usersResultUnder=ForumStats.averagePostsForUsersUnderAge(users);
        double delta=0.01;
        assertEquals(1191.75,usersResultUnder,delta);


    }
}