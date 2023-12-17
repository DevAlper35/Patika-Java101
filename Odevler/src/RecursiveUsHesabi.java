import java.util.Scanner;
public class RecursiveUsHesabi {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Advanced Calculator
            A program that uses the "Recursive" method for exponentiation with base and exponent values taken from the user.
            Note: There is no exception checking.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban sayısınız girin: ");
        int base = scanner.nextInt();
        System.out.print("Üs sayısını girin: ");
        int exponent = scanner.nextInt();

        System.out.println("Sonuç= " + exponentiation(base, exponent));
    }

    static int exponentiation(int base, int exponent){
        if(exponent == 0) return 1;
        else return base * exponentiation(base, exponent - 1);
    }
}
