package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(Job job, String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
        System.out.println(firstName + " jest " + job.getJobTitle() + " do jego obowiązków należy " + job.getResponsibilities());

    }

}

