//package com.kodilla.inheritance.homework;
//
//import java.util.Scanner;
//
//public class NewOperatingSystem extends OperatingSystem {
//
//    public NewOperatingSystem(int yearRelease, int processor) {
//        super(yearRelease, processor);
//    }
//
//
//    public static void userAnswer() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Do you have cable to the printer?");
//            String answer = scanner.nextLine().trim().toUpperCase();
//            String answer1 = "YES";
//            String answer2 = "NO";
//            switch (answer) {
//                case "Y":
//                    answer = answer1;
//                    break;
//
//                case "N":
//                    answer = answer2;
//                    break;
//                default:
//                    System.out.println("Wrong answer,choice Y or N");
//            }
//            if (answer.equals(answer1)) {
//
//                System.out.println(text);
//            } else {
//                System.out.println("Connect with wifi");
//            }
//        }
//    }
//}
