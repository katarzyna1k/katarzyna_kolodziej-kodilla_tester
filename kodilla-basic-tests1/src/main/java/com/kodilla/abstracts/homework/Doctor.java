package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public String getJobTitle() {
        return "Doctor";
    }

    public  String getResponsibilities() {
        return this.responsibilities;
    }
}
