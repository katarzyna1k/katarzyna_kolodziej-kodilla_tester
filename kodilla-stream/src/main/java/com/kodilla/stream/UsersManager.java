package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        processUserStream();

        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> olderThan = olderThanUserAge(45);
        //printOlderUsers(olderThan);
        System.out.println(olderThan);

        long numberOfCountedPosts = sumOfPostsWithLimit();
        System.out.println(numberOfCountedPosts);


    }

    private static void processUserStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)       //(user->user.getUsername())
                .forEach(username -> System.out.println(username));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;

    }

    public static List<User> olderThanUserAge(int number) {
        List<User> usersAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > number)
                .collect(Collectors.toList());
        return usersAge;
    }

//    public static void printOlderUsers(List<User> users) {
//        users.forEach(System.out::println);
//    }

    public static long sumOfPostsWithLimit() {
        long countedPosts = UsersRepository.getUsersList()
                .stream()
                .mapToLong(u-> u.getNumberOfPost())
                .filter(n -> n> 2)
                .count();
        return countedPosts;
    }
}
