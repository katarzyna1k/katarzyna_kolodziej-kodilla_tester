public class SimpleArray {
    public static void main(String[] args) {
        String[] sport = new String[6];
        sport[0] = "Badminton";
        sport[1] = "Rugby";
        sport[2] = "Hurling";
        sport[3] = "Tchoukball";
        sport[4] = "Unihokej";
        sport[5] = "Lacrosse";

        String sports = sport[2];
        System.out.println(sports);

        int numberOfElements = sport.length;
        System.out.println("Ta tablica zawiera "+numberOfElements+" elementów");
    }
}
