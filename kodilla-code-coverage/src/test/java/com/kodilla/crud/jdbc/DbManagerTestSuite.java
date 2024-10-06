//package com.kodilla.crud.jdbc;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.AbstractMap;
//import java.util.List;
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DbManagerTestSuite {
//    private static DbManager dbManager;
//
//    @BeforeAll
//    public static void setUp() throws SQLException {
//        dbManager = DbManager.getInstance();
//    }
//
//    @Test
//    void testConnect() {
//        assertNotNull(dbManager.getConnection());
//    }
//
//    @Test
//    void testSelectUsers() throws SQLException {
//        //Given
//        String countQuery = "SELECT COUNT(*) FROM USERS";
//        Statement statement = createStatement();
//        ResultSet rs = statement.executeQuery(countQuery);
//        int count = getRowsCount(rs);
//        insertUsers(statement);
//
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        statement = createStatement();
//        rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = getResultsCount(rs);
//        int expected = count + 5;
//        assertEquals(expected, counter);
//
//        rs.close();
//        statement.close();
//
//    }
//
//    private Statement createStatement() throws SQLException {
//        return dbManager.getConnection().createStatement();
//    }
//
//    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
//            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
//            new AbstractMap.SimpleEntry<>("Otman", "Use"),
//            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
//            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
//            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
//    );
//
//    private void insertUsers(Statement statement) throws SQLException {
//        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
//            statement.executeUpdate(
//                    String.format("INSERT INTO USERS(FIRSTNAME,LASTNAME) VALUES ('%s','%s')",
//                            user.getKey(),
//                            user.getValue())
//            );
//        }
//    }
//
//    private static int getResultsCount(ResultSet rs) throws SQLException {
//        int counter = 0;
//        while (rs.next()) {
//            System.out.printf("%d, %s, %s%n",
//                    rs.getInt("ID"),
//                    rs.getString("FIRSTNAME"),
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        return counter;
//    }
//
//    private static int getRowsCount(ResultSet rs) throws SQLException {
//        int count = 0;
//        while (rs.next()) {
//            count = rs.getInt("COUNT(*)");
//        }
//        return count;
//    }
//
//    @Test
//    void testSelectUsersAndPosts() throws SQLException {
//        String sqlQuery = "SELECT  firstname , lastname, u.id,COUNT(u.id)\n" +
//                "FROM users AS u \n" +
//                "INNER JOIN posts AS p ON u.id= p.user_id \n" +
//                "GROUP BY u.id\n" +
//                "ORDER BY firstname, lastname;";
//        Statement statement = createStatement();
//        ResultSet resultSet = statement.executeQuery(sqlQuery);
//        int howManyPeopleHavePosts = getHowManyHaveMoreThan2Posts(resultSet);
//        insertPostsAndUsers(statement);
//
//        String sqlQueryAfterAdd = "SELECT  firstname , lastname, u.id,COUNT(u.id)\n" +
//                "FROM users AS u \n" +
//                "INNER JOIN posts AS p ON u.id= p.user_id \n" +
//                "GROUP BY u.id\n" +
//                "ORDER BY firstname, lastname;";
//        statement = createStatement();
//        resultSet = statement.executeQuery(sqlQueryAfterAdd);
//
//        int howManyPeopleHavePostsAfterAdd = getAfterAddHowManyPeopleHaveMoreThan2Posts(resultSet);
//        int expected = howManyPeopleHavePosts + 3;
//        assertEquals(expected, howManyPeopleHavePostsAfterAdd);
//
//        resultSet.close();
//        statement.close();
//
//
//    }
//
//
//    private void insertPostsAndUsers(Statement statement) throws SQLException {
//        statement.executeUpdate(
//                String.format("INSERT INTO POSTS(body, user_id) VALUES ('%s',1 )",
//                        "This is a post."))
//        ;
//        statement.executeUpdate(
//                String.format("INSERT INTO POSTS(body, user_id) VALUES ('%s',2 )",
//                        "This is another post."))
//        ;
//        statement.executeUpdate(String.format("INSERT INTO POSTS(body, user_id) VALUES ('%s',29 )",
//                "This is a third post."
//        ));
//
//    }
//
//    private static int getHowManyHaveMoreThan2Posts(ResultSet resultSet) throws SQLException {
//        int count = 0;
//        while (resultSet.next()) {
//            count = resultSet.getInt("COUNT(u.id)");
//        }
//        return count;
//    }
//
//    private static int getAfterAddHowManyPeopleHaveMoreThan2Posts(ResultSet resultSet) throws SQLException {
//        int count = 0;
//        while (resultSet.next()) {
//            System.out.printf("%s,%s%n",
//                    count = resultSet.getString("lastname"));
//        }
//        return count;
//    }
//
//
//}