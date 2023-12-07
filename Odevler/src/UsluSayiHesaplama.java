import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("Üssü alınacak sayıyı gir: "); int number = input.nextInt();
        System.out.print("Üs olacak sayıyı gir: "); int us = input.nextInt();

        for(int i=1;i<=us;i++){
             result *= number;
        }
        System.out.println(number + " sayısının " + us + " üssü : " + result);
    }
}