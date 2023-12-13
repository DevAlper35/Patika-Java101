import java.util.Scanner;
// Kullanıcdan alınan sayıya göre, döngüler ile "*" kullanarak elmas çizimi yapma kodlaması
public class ElmasCizimi {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int x = 1; x <= (number - i); x++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * i) - 1; y++) { //
                System.out.print("*");
            }
            System.out.println();

        }
        for (int k = number; k >= 0; k--) {
            for (int j = 0; j < (number - k); j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (k * 2) - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
