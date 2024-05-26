public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User lola = new User("Lola", 15); //kazdy obiekt reprezentuje osobę i zawiera pole "age"
        //lola.averageAge();
        User kora = new User("Kora", 58);
        //kora.averageAge();
        User romuald = new User("Romuald", 44);
        //romuald.averageAge();
        User brunhilda = new User("Brunhilda", 22);
        //brunhilda.averageAge();
        User[] users = {lola, kora, romuald, brunhilda}; //tablica zbiór obiektów, dlatego nie String;


        System.out.println("To jt suma wieku użytkowników Users: " + User.averageAge(users));
        System.out.println("Użytkownicy poniżej średniej wartości wieku: " + User.checkUser(users));

    }

    public static double averageAge(User[] users) { //żeby skorzystać z tablicy obiektów gdzie jt zmienna age
        int ageSum = 0;
        for (int i = 0; i < users.length; i++) {
            int userAge = users[i].age;
            ageSum += userAge;
        }
        return (double) ageSum / users.length;
    }


    public static String checkUser(User[] users) {
        String youngestName = "";
        int youngestAge = Integer.MAX_VALUE;
        for (int i = 0; i < users.length; i++) {
            int userAge = users[i].age;
            double average = User.averageAge(users);
            if (userAge < average && userAge < youngestAge) {
                youngestName = users[i].name;
                youngestAge = userAge;
            }
        }
        return youngestName;
    }
}


