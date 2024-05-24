public class Grades {


    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }


    public void add(int value) {
        if (this.size == 10) { //porównuje czy tablica ma do 10 el.
            return;
        }
        this.grades[this.size] = value;
        this.size++;

    }

    public static void main(String[] args) {
        Grades grade1 = new Grades();
        grade1.add(4);
        grade1.add(2);
        grade1.add(5);
        grade1.add(6);
        grade1.add(1);
        grade1.add(1);
        grade1.add(1);
        grade1.add(1);
        grade1.add(1);
        grade1.add(1); //jeśli dod. 11 element to tylko nie bierze jego pod uwagę i liczy nie mnożąc problemów

        System.out.println("ostadnia ocena " + grade1.checkGrades()); //tylko możliwe tak bo met. zwraca wart.,trzeba wywołać met.
        System.out.println("ostadnia suma " + grade1.sumGrades());
        System.out.println("ostadnia srednia " + grade1.sredniaZsumy());


        Grades grade2 = new Grades();//tw. tu jt druga tablica
        System.out.println("Ocena nr 2 " + grade2.grades + " " + grade2.size);
        grade2.add(5);
        grade2.checkGrades();
        grade2.sumGrades();
        grade2.sredniaZsumy();


    }

    public int checkGrades() {
        int gradeNextElement = this.grades[this.size - 1]; //java widzi this.grade jako następny el tablicy, kt jeszcze nieistnieje, dlatego trzeba odjąć
        return gradeNextElement;
    }

    public int sumGrades() { //met. liczy tylko sumę
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            int result = this.grades[i];
            sum += result;

        }
        return sum;
    }

    public double sredniaZsumy() {
        double suma = sumGrades(); //tu nawiasy bo odwołanie w zmiennej do metodky
        double srednia = suma / this.size; //dzieli przez wsystkie indeksy tablicy
        return srednia;
    }
}