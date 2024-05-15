public class FirstName {
    public static void main(String[] args) {
        String[] names = new String[]{"Zdziław", "Klementyna", "Henrietta"};
        System.out.println(names);

        String name = names[1];
        System.out.println(name);


        int numberOfElements = names.length;
        System.out.println(numberOfElements);

        for (int i = 0; i <= 2; i++) {
            //for (int i = 0; i < names.length; i++) {
            // System.out.println(names[i]);
            System.out.println(names[i]);
        }


    }
}
