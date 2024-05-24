public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double area = calculator.circleArea(10);
        System.out.println("obwód koła o promieniu 10 jest równy: " + area);

        double p = Calculator.PI;
        System.out.println("Wartość liczby Pi jt równa: " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
