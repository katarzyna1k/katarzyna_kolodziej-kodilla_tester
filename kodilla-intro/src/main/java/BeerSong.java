public class BeerSong {
    public static void main(String[] args) {
        int numberOfBottles = 10;
        String word = "bottles";

        while (numberOfBottles > 0) {
            if (numberOfBottles == 1) {
                word = "bottle";
            }
            System.out.println(numberOfBottles + " green " + word + " , hanging on the wall");
            System.out.println(numberOfBottles + " green " + word + " , hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall, ");

            numberOfBottles --;

            if (numberOfBottles > 0) {
                System.out.println("There'll be " + numberOfBottles + " green " + word + " , hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}
