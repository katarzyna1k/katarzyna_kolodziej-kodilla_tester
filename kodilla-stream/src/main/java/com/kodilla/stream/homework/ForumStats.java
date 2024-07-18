package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.OptionalDouble;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        double avgPostsOverForty = averagePostsForUsersOverAge(users);
        System.out.println(avgPostsOverForty);

        double avgPostsUnderForty=averagePostsForUsersUnderAge(users);
        System.out.println(avgPostsUnderForty);
    }


    public static double averagePostsForUsersOverAge(List<User> users) {
        OptionalDouble avgPostsOver = users
                .stream()
                .filter(n -> n.getAge() >= 40)
                .mapToDouble(u -> u.getNumberOfPost())
                .average();
        return avgPostsOver.orElse(0.0);
    }

    public static double averagePostsForUsersUnderAge(List<User> users) {
        OptionalDouble avgPostsUnder = users
                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToDouble(u -> u.getNumberOfPost())
                .average();
        return avgPostsUnder.orElse(0.0);
    }


}
