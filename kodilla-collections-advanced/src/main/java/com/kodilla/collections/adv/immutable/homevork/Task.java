package com.kodilla.collections.adv.immutable.homevork;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        TaskRecord taskLearn = new TaskRecord("Learning", 3);
        TaskRecord taskJob = new TaskRecord("Working", 8);
        TaskRecord taskSleep = new TaskRecord("Sleeping", 6);
        TaskRecord taskCook = new TaskRecord("Cooking", 2);
        TaskRecord taskOther = new TaskRecord("Other things", 1);


        System.out.println("This is what You've done today: " + taskCook + taskJob + taskSleep + taskLearn + taskOther);
        int sumOfTasks = getSumOfTasks(taskJob, taskOther, taskLearn, taskCook, taskSleep);
        System.out.println(sumOfTasks);
        tasksPerDay();
    }

    private static int getSumOfTasks(TaskRecord... taskRecord) {
        int sum = 0;
        for (TaskRecord tasks : taskRecord)
            sum += tasks.duration();
        return sum;
    }

    private static void tasksPerDay() {
        Scanner scanner = new Scanner(System.in);
        int sumTasks = getSumOfTasks();
        if (sumTasks == 24) {
            System.out.println(sumTasks);
        } else {
            System.out.println("You have some time left to do things! What You want to do? " );
            String question = scanner.nextLine();
        }
    }

}