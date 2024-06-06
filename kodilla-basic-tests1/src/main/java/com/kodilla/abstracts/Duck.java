package com.kodilla.abstracts;

public class Duck extends Animal {

    public Duck(int numberOfLegs,String name) {

        super(2, name);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack!");

    }

    @Override
    public void hasName() {
        System.out.println("By the power given to me by me i call You;  " + getName());

    }
}
