import java.util.Scanner;
public class daireAlaniCevresiHesaplama {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int r,a;
        double pi=3.14;
        System.out.print("Lütfen Dairenin Yarı Çapını Giriniz : ");
        r = input.nextInt();
        System.out.print("Lütfen Merkez Açısını Giriniz : ");
        a = input.nextInt();
        double alan = pi * r * r ;
        double cevre = 2 * pi * r;
        double dairedilimi = ((alan * a) / 360);
        System.out.println("Dairenizin Alanı : " + alan);
        System.out.println("Dairenizin Çevresi : " + cevre);
        System.out.println("Dairenizin Dilimi Alanı : " + dairedilimi);
        
    }
}
