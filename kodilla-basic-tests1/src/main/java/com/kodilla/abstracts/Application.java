package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog(4, "Terror");
        //dog.giveVoice();
        dog.hasName();

        Duck duck = new Duck(2,"Donald");
        //duck.giveVoice();
        duck.hasName();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);
    }
}
