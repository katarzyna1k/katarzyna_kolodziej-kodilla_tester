import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        RandomNumbers lotto = new RandomNumbers();

        int maxSum = lotto.getSumOfRandomNumbers(5000);

        System.out.println("Zwracana liczba losowań: " + maxSum);

    }


    int getSumOfRandomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int maxNumber = 0;
        int minNumber = 30;
        while (sum < max) {
            int number = random.nextInt(31);
            sum += number;
            result++;
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }

        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
        return result;
    }
}


