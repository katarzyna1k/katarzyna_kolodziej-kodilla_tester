import java.util.Random;

public class WhileRandom {


    public static void main(String[] args) {
        //System.out.println(getCountOfRandomNumber(15));
        WhileRandom nowyObiekt= new WhileRandom();

        int nowaZmienna= nowyObiekt.getCountOfRandomNumber (15);
        System.out.println(nowaZmienna);




    }

     int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;

        }
        return result;
    }
}
