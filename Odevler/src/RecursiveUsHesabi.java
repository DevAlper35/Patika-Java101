import java.util.Scanner;
public class RecursiveUsHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısınız girin: ");
        int base = input.nextInt();
        System.out.print("Üs sayısını girin: ");
        int exponent = input.nextInt();

        System.out.println("Sonuç= " + exponentiation(base, exponent));
    }

    static int exponentiation(int base, int exponent){
        if(exponent == 0) return 1;
        else return base * exponentiation(base, exponent - 1);
    }
}
