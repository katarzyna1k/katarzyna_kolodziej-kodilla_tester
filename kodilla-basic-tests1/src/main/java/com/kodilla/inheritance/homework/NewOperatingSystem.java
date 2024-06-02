package com.kodilla.inheritance.homework;

import java.util.Scanner;

public class NewOperatingSystem extends OperatingSystem {

    public NewOperatingSystem(int yearRelease, int processor) {
        super(yearRelease, processor);
    }

    @Override
    public void connectPrinter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you have cable to the printer?");
            String answer = scanner.nextLine().trim().toUpperCase();
            String answer1 = "NO";
            String answer2 = "YES";
            switch (answer) {
                case "N":
                    answer = answer1;
                    break;

                case "Y":
                    answer = answer2;
                    break;
                default:
                    System.out.println("Wrong answer,choice Y or N");
            }
            if (answer.equals(answer1)) {

                System.out.println("Connect with wifi");
            } else {
                return;
            }
            return;
        }
    }
}

