package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampWidth;
    private double stampLength;
    private boolean stamped;


    public Stamp(String stampName, double stampWidth, double stampLength,boolean stamped) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
        this.stamped=stamped;
    }

    public double getStampLength() {
        return stampLength;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public String getStampName() {
        return stampName;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                ", stamped=" + stamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stampWidth, stamp.stampWidth) == 0 && Double.compare(stampLength, stamp.stampLength) == 0 && stamped == stamp.stamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampLength, stamped);
    }
}
