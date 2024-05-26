import java.util.Scanner;

public class UserColours {
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your colour: ");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "G":
                    return "GREEN";
                case "R":
                    return "RED";
                case "Y":
                    return "YELLOW";
                case "B":
                    return "BLUE";
                default:
                    System.out.println("Wrong colour, please try again.");
            }
        }
    }
}
