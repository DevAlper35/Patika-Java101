import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar girin: ");
        double tutar = input.nextInt();
        double kdvlifiyat = tutar >= 1000 ? (tutar * 0.08)+tutar : (tutar * 0.18)+tutar;
        System.out.println(tutar + "TL KDV ile birlikte, " + kdvlifiyat + "TL yapıyor");
    }

}
