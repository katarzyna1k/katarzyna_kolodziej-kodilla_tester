import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        RandomNumbers lotto = new RandomNumbers();

        int min = 0;
        int max = 30;
        int sum = 0;

        int maxSum = lotto.getSumOfRandomNumbers(5000);

        System.out.println("Zwracana liczba losowań: " + maxSum);
        System.out.println("zw " + lotto.maxNumber(maxSum));
    }


    int getSumOfRandomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int number = random.nextInt(30);
            sum += number;
            result++;
        }
        return result;
    }

    int maxNumber(int maxSum) {
        Random random = new Random();
        int maxNumber = 0;
        for (int i = 0; i < maxSum; i++) {
            int number = random.nextInt(30);
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
}


