import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma =3.67, domates = 1.11, muz = 0.95, patlican = 5;

        System.out.println("Armut Kaç Kilo ? ");
        armut *= input.nextDouble();
        System.out.println("Elma Kaç Kilo ? ");
        elma *= input.nextDouble();
        System.out.println("Domates Kaç Kilo ? ");
        domates *= input.nextDouble();
        System.out.println("Muz Kaç Kilo ? ");
        muz *= input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? ");
        patlican *= input.nextDouble();

        double tutar = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Tutar : " + tutar);



    }
}
