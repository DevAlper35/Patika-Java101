import java.util.Scanner;
public class RecursivePrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int number = input.nextInt();

        if(isPrime(number, number / 2))
            System.out.println(number + " asal sayı.");
        else
            System.out.println(number + " asal sayı değil.");
    }

    static boolean isPrime(int num, int divisor){

        if(num < 2) return false;
        else if(divisor == 1) 
            return true;
        else
        {
            if(num % divisor == 0) return false;
            else 
                return isPrime(num, divisor - 1);
        }
    }
}
