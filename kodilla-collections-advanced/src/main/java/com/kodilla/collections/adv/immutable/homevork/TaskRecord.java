package com.kodilla.collections.adv.immutable.homevork;

public record TaskRecord(String title,int duration) {

    @Override
    public String toString() {
        return "{" +
                "'" + title + '\'' +
                ", for=" + duration +" hours "+
                '}';
    }
}
