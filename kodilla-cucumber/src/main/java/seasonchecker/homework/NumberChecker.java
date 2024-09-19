package seasonchecker.homework;

public class NumberChecker {

    public static String checkDivision(int number) {
        if (numberDivideByThree(number) && numberDivideByFive(number)) {
            return "FizzBuzz";
        } else if (numberDivideByFive(number)) {
            return "Buzz";
        } else if (numberDivideByThree(number)) {
            return "Fizz";
        }
        return "None";
    }

    public static boolean numberDivideByThree(int number) {
        return number % 3 == 0;
    }

    public static boolean numberDivideByFive(int number) {
        return number % 5 == 0;
    }
}
