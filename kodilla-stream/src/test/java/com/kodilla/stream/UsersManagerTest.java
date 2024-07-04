package com.kodilla.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UsersManagerTest {

    @Test
    public void shouldReturnUsernameForGroupChemists() {
        List<String> zmienna = UsersManager.filterChemistGroupUsernames();
        Assertions.assertEquals(2, zmienna.size());

        List<String> username = new ArrayList<>();
        username.add("Walter White");
        username.add("Gale Boetticher");
        Assertions.assertEquals(username,zmienna);


    }
}
