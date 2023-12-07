import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int fac1=1, fac2=1, fac3=1, n, r, kombinasyon;
        System.out.print("N girin: ");
        n = input.nextInt();

        System.out.print("C girin: ");
        r = input.nextInt();

        for(int i=1; i<=n; i++)
        {
            fac1 *=i;
        }
        for(int i=1; i<=r; i++)
        {
            fac2 *=i;
        }
        for(int i=1; i<=(n-r); i++)
        {
            fac3 *=i;
        }
        kombinasyon= fac1 / (fac2 * fac3);

        System.out.println("Kombinasyonu C(n,r): "+ kombinasyon);

    }
}
