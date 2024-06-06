package com.kodilla.basic_assertion;

public class Application {


    public static void main(String[] args) {
        Calculator calc = new Calculator(13, 8, 5, 5);
        calc.addition();
        calc.subtraction();
        calc.pow();


        //int sumResult = calc.addition();
        int subResult = calc.subtraction();
        double doubleResult = calc.pow();

        System.out.println("wynik dodawania to " + calc.addition() + " wynik odejmowania to " + calc.subtraction() + " wynik potęgowania to " + calc.pow());
        boolean correct = ResultChecker.assertEquals(21, calc.addition());//sumResult);
        if (correct) {
            System.out.println("Metoda addition działą poprawnie dla liczb " + calc.getIntA() + " i " + calc.getIntB());
        } else {
            System.out.println("Metoda addition nie działa poprawnie dla liczb " + calc.getIntA() + " i " + calc.getIntB());
        }

        boolean correctSub = ResultChecker.assertEquals(5, subResult);
        if (correctSub) {
            System.out.println("Metoda subtraction działa poprawnie dla liczb " + calc.getIntA() + " i " + calc.getIntB());
        } else {
            System.out.println("Metoda subtraction działa niepoprawnie dla liczb " + calc.getIntA() + " i " + calc.getIntB());
        }

        boolean correctPow = ResultChecker.assertEquals(3125, (int) doubleResult);
        if (correctPow) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + calc.getIntC() + " i potęgi " + calc.getIntD());
        } else {
            System.out.println("Metoda pow działa niepoprawnie dla liczby " + calc.getIntC() + " i potęgi " + calc.getIntD());
        }
    }
}
