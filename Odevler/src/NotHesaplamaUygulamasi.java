import java.util.Scanner;
public class NotHesaplamaUygulamasi {
    public static void main(String[] args) {

        Scanner matematik=new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        int a = matematik.nextInt();

        Scanner fizik=new Scanner(System.in);
        System.out.print("Fizik notunu giriniz: ");
        int b = fizik.nextInt();

        Scanner kimya=new Scanner(System.in);
        System.out.print("Kimya notunu giriniz: ");
        int c = kimya.nextInt();

        Scanner turkce=new Scanner(System.in);
        System.out.print("Türkçe notunu giriniz: ");
        int d = turkce.nextInt();

        Scanner tarih=new Scanner(System.in);
        System.out.print("Tarih notunu giriniz: ");
        int e = tarih.nextInt();

        Scanner muzik=new Scanner(System.in);
        System.out.print("Müzik notunu giriniz: ");
        int f = muzik.nextInt();

        double ortalama=((a+b+c+d+e+f)/6);
        System.out.println("ortalamanız:" + ortalama);

        String sonuc = ortalama >= 60 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.print(sonuc);
    }
}
