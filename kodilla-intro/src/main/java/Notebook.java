public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) { //konstruktor(nazwa zawsze jak nazwa klasy)
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 1500, 2020);
        System.out.println("Notebook: " + notebook.weight + "  " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 2000, 2022);
        System.out.println("Heavy Notebook: " + heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 900, 2010);
        System.out.println("Old Notebook: " + oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Notebook newNotebook = new Notebook(1200, 800, 2020);
        System.out.println("New Notebook: " + newNotebook.weight + " " + newNotebook.price + " " + newNotebook.year);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkYear();
    }

    public void checkPrice() {

        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }

    }

    public void checkWeight() {

        if (this.weight >= 2000) {
            System.out.println("This is a heavy weight notebook.");
        } else if (this.weight < 2000 && this.weight > 700) {
            System.out.println("This notebook has medium weight.");
        } else {
            System.out.println("It is not a heavy notebook.");
        }
    }

    public void checkYear() {

        if (this.year > 2015 && this.price > 600) {
            System.out.print("New is always pricey.");
        } else if (this.year > 2015 && this.price < 600) {
            System.out.println("It's not true, new is cheeper!");
        } else {
            System.out.println("You can not tell if year of production determinate price of a notebook.");
        }
    }
}
