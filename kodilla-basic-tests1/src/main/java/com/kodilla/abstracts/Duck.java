package com.kodilla.abstracts;

public class Duck extends Animal {

    public Duck() {

        super(2, "Donald");
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack!");

    }
}
