public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;


        System.out.println(year);


        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("To jest rok przestępny");
        } else {
            System.out.println("To nie jest rok przestępny");
        }
    }
}

