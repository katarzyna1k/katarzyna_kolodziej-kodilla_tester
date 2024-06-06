import java.util.Scanner;

public class UserColours {

    enum Colour {
        YELLOW,
        GREEN,
        RED,
        BLUE
    }

    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) { //zapyta tylko raz przy blędnym wpisaniu!
            System.out.println("Choose your colour: ");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "G":
                    return Colour.GREEN.name();
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
