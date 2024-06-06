package com.kodilla.abstracts;

public class Dog extends Animal {
    public Dog(int numberOfLegs, String name) {
        super(4, name);

    }

    @Override
    public void giveVoice() {
        System.out.println("Hau Hau!");

    }

    @Override
    public void hasName() {
        System.out.println("By the power given to me by me i call You;  " + getName());

    }

    public void dogHasName() {
        System.out.println("By the power given to me by me i call You;  " + getName());

    }

}
