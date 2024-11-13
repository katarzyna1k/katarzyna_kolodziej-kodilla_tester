public class Loop {
    public static void main(String[] args) {
        int[] tab = new int[10];

        //wypełnienie tablicy za pomocą pętli "for"
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
            System.out.println(tab[i]);
        }
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println("To  jt suma elementów tablicy " + sum);


        int element = tab[3];
        System.out.println(element);



        //int numberOfElements = tab.length;
        //System.out.println(numberOfElements);


    }

}
//public int sumNumbers(int[] numbers) {
//   int result = 0;
//   for (int i = 0; i < numbers.length; i++) {
//      result = result + numbers[i];
//   }
//   return result;
//}