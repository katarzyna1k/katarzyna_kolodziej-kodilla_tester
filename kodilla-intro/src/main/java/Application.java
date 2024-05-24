public class Application {
    String personName;
    double personAge;
    double personHeight;

    public Application(String personName, double personAge, double personHeight) {
        this.personName = personName;
        this.personAge = personAge;
        this.personHeight = personHeight;
    }

    public static void main(String[] args) {
        Application person = new Application("John", 25, 1.75);
        person.hasName();
        person.checkInfo();
        person.getPersonName();
        person.getPersonAge();
        person.getPersonHeight();

        System.out.println(person.getPersonName());
        System.out.println(person.getPersonAge());
        System.out.println(person.getPersonHeight());
    }

    public boolean hasName() {
        return personName != null && !personName.isEmpty();
    }


    public void checkInfo() {
        if (hasName()) {
            if (personAge > 30 && personHeight > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public String getPersonName() {
        return personName;
    }

    public double getPersonAge() {
        return personAge;
    }

    public double getPersonHeight() {
        return personHeight;

    }
}


