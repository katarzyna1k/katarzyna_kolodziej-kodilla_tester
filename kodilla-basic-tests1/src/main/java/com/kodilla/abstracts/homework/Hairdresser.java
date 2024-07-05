package com.kodilla.abstracts.homework;

public class Hairdresser extends Job {

    public Hairdresser(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public String getJobTitle() {
        return "Hairdresser";
    }

    public String getResponsibilities() {
        return this.responsibilities;
    }
}
