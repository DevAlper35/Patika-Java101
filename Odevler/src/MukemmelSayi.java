import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int n,i,counter=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin: ");
        n = input.nextInt();

        for(i=1; i<n; i++){
            if(n%i == 0){
                counter+=i;
                System.out.println(i + " " + counter + " if çalıştı");
            }
            else{
                System.out.println(i + " " +counter + " Else çalıştı");
            }
        }
        if(counter == n){
            System.out.print("Girdiğiniz " + n + " sayısı mükemmel sayıdır.");
        }
        else{
            System.out.print("Girdiğiniz  " + n +" sayısı mükemmel sayı değildir. ");
        }

    }
}
