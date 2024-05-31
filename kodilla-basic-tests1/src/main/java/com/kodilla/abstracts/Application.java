package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog(4, "Terror");
        //dog.giveVoice();
        dog.dogHasName();

        Duck duck = new Duck();
        //duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
