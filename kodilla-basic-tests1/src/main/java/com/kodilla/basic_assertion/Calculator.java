package com.kodilla.basic_assertion;

public class Calculator {
    private int a;
    private int b;
    private double c;
    private double d;

    public Calculator(int a, int b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getIntA() {
        return this.a;
    }

    public int getIntB() {
        return this.b;
    }

    public double getIntC() {
        return this.c;
    }

    public double getIntD() {
        return this.d;
    }

    public int addition() {
        int sum = this.a + this.b;
        return sum;
    }

    public int subtraction() {
        int sub = this.a - this.b;
        return sub;
    }

    public double pow() {
        double wynik = Math.pow(this.c, this.d);
        return wynik;
    }

}
