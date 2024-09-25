package com.kodilla.jacoco;

public class Year {

    int yearExample;

    public Year(int yearExample) {
        this.yearExample = yearExample;
    }

    public boolean isLeap() {
        if (this.yearExample % 4 == 0) {
            if (this.yearExample % 100 == 0) {
                return this.yearExample % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
