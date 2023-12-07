import java.util.Scanner;

public class DortVeBesinKuvvetleriHesabi {
    public static void main(String[] args) {
        int count = 0, number;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        number = input.nextInt();

        for (int i = 1; i <= number;i*=4){

            System.out.println("4'ün "+ count + ". kuvveti: " + i);
            count++;
        }
        count=0;
        for (int i = 1; i <= number;i*=5){

            System.out.println("5'in "+ count + ". kuvveti: " + i);
            count++;
        }
    }
}
