package com.kodilla.crud.jdbc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setUp() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        assertEquals(expected, counter);

        rs.close();
        statement.close();

    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME,LASTNAME) VALUES ('%s','%s')",
                            user.getKey(),
                            user.getValue())
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        insertTestData();

        String sqlQuery = "SELECT firstname, lastname, COUNT(p.id) AS post_count " +
                "FROM users AS u " +
                "INNER JOIN posts AS p ON u.id = p.user_id " +
                "GROUP BY u.id, u.firstname, u.lastname " +
                "HAVING COUNT(p.id) >= 2 " +
                "ORDER BY u.firstname, u.lastname;";


        Statement statement = createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);


        int userCount = 0;
        while (resultSet.next()) {
            String firstName = resultSet.getString("firstname");
            String lastName = resultSet.getString("lastname");
            int postCount = resultSet.getInt("post_count");


            System.out.printf("User: %s %s, Posts: %d%n", firstName, lastName, postCount);
            userCount++;
        }

        assertTrue(userCount >= 2, "Expected at least 2 users with more than 2 posts");

        resultSet.close();
        statement.close();
    }


    private void insertTestData() throws SQLException {
        Statement statement = createStatement();

        statement.executeUpdate("INSERT INTO users(firstname, lastname) VALUES ('John', 'Doe')");
        statement.executeUpdate("INSERT INTO users(firstname, lastname) VALUES ('Jane', 'Smith')");
        statement.executeUpdate("INSERT INTO users(firstname, lastname) VALUES ('Bob', 'Brown')");


        statement.executeUpdate("INSERT INTO posts(body, user_id) VALUES ('Post by John', 1)");
        statement.executeUpdate("INSERT INTO posts(body, user_id) VALUES ('Post by John - second', 1)");
        statement.executeUpdate("INSERT INTO posts(body, user_id) VALUES ('Post by Jane', 2)");
        statement.executeUpdate("INSERT INTO posts(body, user_id) VALUES ('Post by Jane - second', 2)");
        statement.executeUpdate("INSERT INTO posts(body, user_id) VALUES ('Post by Bob', 3)");
        statement.executeUpdate("INSERT INTO posts(body, user_id) VALUES ('Another post by Bob', 3)");

        statement.close();
    }


}