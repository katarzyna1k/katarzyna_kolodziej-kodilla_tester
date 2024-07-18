package com.kodilla.collections.adv.immutable.homework;

import java.util.Scanner;

public class DayTasks {
    public static void main(String[] args) {
        Task taskLearn = new Task("Learning", 3);
        Task taskJob = new Task("Working", 8);

        Task taskSleep = new Task("Sleeping", 5);
        getSleep(taskSleep);
        Task taskCook = new Task("Cooking", 2);
        Task taskOther = new Task("Other things", 1);


        System.out.println("This is what You've done today: " + taskCook + taskJob + taskSleep + taskLearn + taskOther);
        int sumOfTasks = getSumOfTasks(taskJob, taskOther, taskLearn, taskCook, taskSleep);
        System.out.println(sumOfTasks);
        tasksPerDay();
    }

    private static int getSumOfTasks(Task... task) {
        int sum = 0;
        for (Task tasks : task)
            sum += tasks.duration();
        return sum;
    }

    private static int getSleep(Task taskSleep) {
        int sleep = taskSleep.duration();
        if (sleep < 6)
            System.out.println("Get some sleep!");
        return sleep;
    }

    private static void tasksPerDay() {
        int sumTasks = getSumOfTasks();
        if (sumTasks == 24) {
            System.out.println(sumTasks);
        } else {
            System.out.println("You have some time left to do things! What You want to do? Chose from 1 to 5: ");
            Scanner scanner = new Scanner(System.in);
            String question = scanner.nextLine();
            switch (question) {
                case "1":
                    System.out.println("Learn some staff.");
                    break;
                case "2":
                    System.out.println("It's time to work.");
                    break;
                case "3":
                    System.out.println("Night night.");
                    break;
                case "4":
                    System.out.println("You have nothing to eat, lets cook.");
                    break;
                case "5":
                    System.out.println("It's good to have a hobby.");
                    break;
                default:
                    System.out.println("Wrong answer, try again");

            }
        }
    }

}