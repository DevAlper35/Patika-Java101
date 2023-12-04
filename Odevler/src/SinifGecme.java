import java.util.Scanner;
public class SinifGecme {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Not ortalamanızı hesaplamak için notlarınızı girin\n");
        System.out.println("!!! UYARI !!!\n girdiğiniz not 0-100 arasında değilse not 0 kabul edilecektir \n ");
        System.out.print("Matematik: "); byte mat = input.nextByte();
        System.out.print("Fizik: "); byte fizik = input.nextByte();
        System.out.print("Türkçe: "); byte turkce = input.nextByte();
        System.out.print("Kimya: "); byte kimya = input.nextByte();
        System.out.print("Müzik: "); byte muzik = input.nextByte();

        mat = 0 <= mat && mat <=100? mat:0;
        fizik = 0 <= fizik && fizik <=100? fizik:0;
        turkce = 0 <= turkce && turkce <=100? turkce:0;
        kimya = 0 <= kimya && kimya <=100? kimya:0;
        muzik = 0 <= muzik && muzik <=100? muzik:0;

        double ortalama = (double) (mat + fizik + turkce + kimya + muzik) / 5;
        String durum = ortalama >=55?"geçtiniz":"geçemediniz";
        System.out.println("Not ortalamanız : " + ortalama + ". Sınıfı " + durum + ".");

    }
}
