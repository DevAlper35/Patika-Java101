import java.util.Scanner;
public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int number = input.nextInt();
        int total = 1;

        for (int i = 1; i <= number;i++){
            total = total * i;
        }
        System.out.println(number + "! faktöriyel: " + total);
    }
}
