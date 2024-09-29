//package com.kodilla.jdbc;
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
//        String sqlQuery = "SELECT  firstname , lastname, COUNT(*) FROM users AS u INNER JOIN posts AS p ON u.id= p.user_id GROUP BY  firstname, lastname HAVING COUNT(*)>=2 ORDER BY firstname, lastname";
//        Statement statement = createStatement();
//        ResultSet resultSet = statement.executeQuery(sqlQuery);
//        int howManyPeopleHavePosts = getHowManyHaveMoreThan2Posts(resultSet);
//        insertPostsAndUsers(statement);
//
//        String sqlQueryAfterAdd = "SELECT  firstname , lastname, COUNT(*) FROM users AS u INNER JOIN posts AS p ON u.id= p.user_id GROUP BY  firstname, lastname HAVING COUNT(*)>=2 ORDER BY firstname, lastname";
//        statement = createStatement();
//        resultSet = statement.executeQuery(sqlQueryAfterAdd);
//
//        int howManyPeopleHavePostsAfterAdd = getAfterAddHowManyPeopleHaveMoreThan2Posts(resultSet);
//        int expected = howManyPeopleHavePosts + 0;
//        assertEquals(expected, howManyPeopleHavePostsAfterAdd);
//
//        resultSet.close();
//        statement.close();
//
//
//    }
//
//    private static final Map<AbstractMap.SimpleEntry<String, String>, String> USERSPOSTS = Map.of(
//            new AbstractMap.SimpleEntry<>("Heniek", "Mountain"), "This is a post.",
//            new AbstractMap.SimpleEntry<>("Ali", "McKain"), "First post",
//            new AbstractMap.SimpleEntry<>("Ala", "Kruk"), "My name is Ala."
//    );
//
//    private void insertPostsAndUsers(Statement statement) throws SQLException {
//        for (Map.Entry<AbstractMap.SimpleEntry<String, String>, String> userPost : USERSPOSTS.entrySet()) {
//            statement.executeUpdate(String.format(
//                    "INSERT INTO USERS(firstname, lastname) VALUES ('%s', '%s')",
//                    userPost.getKey().getKey(),
//                    userPost.getKey().getValue())
//            );
//            statement.executeUpdate(
//                    String.format("INSERT INTO POSTS(body, user_id) VALUES ('%s', LAST_INSERT_ID())",
//                            userPost.getValue()
//                    )
//            );
//        }
//    }
//
//    private static int getHowManyHaveMoreThan2Posts(ResultSet resultSet) throws SQLException {
//        int count = 0;
//        while (resultSet.next()) {
//            count = resultSet.getInt("COUNT(*)");
//        }
//        return count;
//    }
//
//    private static int getAfterAddHowManyPeopleHaveMoreThan2Posts(ResultSet resultSet) throws SQLException {
//        int count = 0;
//        while (resultSet.next()) {
//            System.out.printf("%s,%s%n",
//                    resultSet.getString("firstname"),
//                    resultSet.getString("lastname"));
//            count++;
//        }
//        return count;
//    }
//
//
//}