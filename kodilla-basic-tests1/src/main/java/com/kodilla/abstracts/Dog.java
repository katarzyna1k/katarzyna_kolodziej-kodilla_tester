package com.kodilla.abstracts;

public class Dog extends Animal {
    public Dog(int numberOfLegs, String name) {
        super(numberOfLegs, name);

    }

    @Override
    public void giveVoice() {
        System.out.println("Hau Hau!");

    }

    public  void dogHasName() {
        System.out.println("By the power given to me by me i call You;  " + getName());

    }

}
