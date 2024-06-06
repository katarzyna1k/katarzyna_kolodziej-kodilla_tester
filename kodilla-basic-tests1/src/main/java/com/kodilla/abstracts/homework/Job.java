package com.kodilla.abstracts.homework;

public abstract class Job {
    private double salary;
    String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public abstract String getJobTitle();

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}
