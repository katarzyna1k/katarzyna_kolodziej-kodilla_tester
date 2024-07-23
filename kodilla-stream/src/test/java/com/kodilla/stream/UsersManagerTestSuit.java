package com.kodilla.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UsersManagerTestSuit {

    @Test
    public void shouldReturnUsernameForGroupChemists() {
        List<String> userChemist = UsersManager.filterChemistGroupUsernames();
        Assertions.assertEquals(2, userChemist.size());

        List<String> username = new ArrayList<>(); //tw. oczekiwaną liste username i
        username.add("Walter White");
        username.add("Gale Boetticher");
        Assertions.assertEquals(username, userChemist); //porównujemy ją z wynikiem met.filterChemistGroupUsernames(), UsersManager.filterChemistGroupUsernames(); filtruje użyt. na podst. grupy
    }

    @Test
    public void testOlderThanUserAge() {
        List<User> usersAge = UsersManager.olderThanUserAge(40);
        Assertions.assertEquals(4, usersAge.size());

        List<User> usersListOfAge = new ArrayList<>();
        usersListOfAge.add(new User("Walter White", 50, 7, "Chemists"));
        usersListOfAge.add(new User("Gus Firing", 49, 0, "Board"));
        usersListOfAge.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        usersListOfAge.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        Assertions.assertEquals(usersListOfAge, usersAge);
    }

    @Test
    public void testSumOfPostsWithLimit() {
        long sumOfPosts = UsersManager.sumOfPostsWithLimit();
        Assertions.assertEquals(3, sumOfPosts);
    }
}
