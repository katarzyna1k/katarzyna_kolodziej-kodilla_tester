package com.kodilla.abstracts.homework;

public class Firefighter extends Job {

    public Firefighter(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public String getJobTitle() {
        return "Firefighter";
    }

    public  String getResponsibilities() {
        return this.responsibilities;
    }
}
