import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int acilis = 10;
        System.out.print("Kilometreyi giriniz: ");
        int km = input.nextInt();
        double tutarKm = (km * 2.2) + 10;
        double toplamTutar = (tutarKm >=20)? tutarKm : 20;
        System.out.println("Toplam tutar " + toplamTutar + "TL");
    }

}
