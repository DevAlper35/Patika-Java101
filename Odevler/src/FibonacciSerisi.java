import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int numberElement, firstElement= 0, secondElement= 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        numberElement = input.nextInt();

        System.out.print(numberElement + " Elemanlı Fibonacci Serisi");

        for (int i = 0; i < numberElement; i++) {
            System.out.print(", " + firstElement);
            int sum = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sum;
        }
    }

}
