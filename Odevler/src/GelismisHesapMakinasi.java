import java.util.Scanner;
public class GelismisHesapMakinasi {
    static Scanner input = new Scanner(System.in);
    static int select=1;
    public static void main(String[] args) {

        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan Hesabi\n"
                + "9- Dikdortgen Cevre Hesabi\n"
                + "0- Cikis Yap";
        while (select != 0){
            System.out.println(menu);
            sep();
            System.out.print("İşlem numarasını girin: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    areaOfaRectangle();
                    break;
                case 9:
                    perimeterOfaRectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz.");
            }
        }


    }
    static void plus() {
        sep();
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc : " + result);
        empty();

    }

    static void minus() {
        sep();
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuc : " + result);
        empty();
    }

    static void times() {
        sep();
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi :");
            number = input.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuc : " + result);
        empty();
    }

    static void divided() {
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuc : " + result);
        empty();
    }

    static void power() {
        System.out.print("Taban degerini giriniz :");
        int base = input.nextInt();
        System.out.print("Us degerini giriniz :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc : " + result);
        empty();
    }

    static void factorial() {
        System.out.print("Sayi giriniz :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
        empty();
    }
    static void mod(){
        System.out.print("1. Sayiyi Giriniz :");
        int number1,number2;
        number1=input.nextInt();
        System.out.print("2. Sayiyi Giriniz :");
        number2=input.nextInt();
        double result=number1%number2;
        System.out.println("MOD :"+result);
        empty();
    }
    static void perimeterOfaRectangle(){
        System.out.print("Dikdorgenin uzun Kenari :");
        double longEdge=input.nextDouble();
        System.out.print("Dikdorgenin Kisa Kenari :");
        double shortEdge=input.nextDouble();
        double perimeter=2*(longEdge+shortEdge);
        System.out.println("Dikdorgenin  Cevresi :"+perimeter);
        empty();
    }
    static void areaOfaRectangle(){
        System.out.print("Dikdorgenin uzun Kenari :");
        double longEdge=input.nextDouble();
        System.out.print("Dikdorgenin Kisa Kenari :");
        double shortEdge=input.nextDouble();
        double area=longEdge*shortEdge;
        System.out.println("Dikdorgenin  Alani :"+area);
        empty();

    }
    static void sep(){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
    static void empty(){
        System.out.println("Çıkmak için '0'a devam etmek için '1'e basın... ");
        int inputEmpty = input.nextInt();
        if (inputEmpty == 0){
            select = 0;
        }


    }

}

