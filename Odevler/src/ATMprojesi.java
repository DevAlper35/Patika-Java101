import java.util.Scanner;
public class ATMprojesi {
    public static void main(String[] args) {
        System.out.println("ATM Projesi");
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        int eklenecekTutar;
        int cekilecekTutar;

        while (right > 0) {
            System.out.print("Lutfen kullanıcı adı giriniz: ");
            userName = input.nextLine();

            System.out.print("Lutfen şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("AlperDev") && password.equals("patikaDev")) {
                do {
                    System.out.println("""
                            1- Para yatırma işlemi
                            2- Para Çekme işlemi
                            3- Bakiye sorgulama işlemi
                            4- Çıkış""");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmaik istediginiz tutarı giriniz: ");
                            eklenecekTutar = input.nextInt();
                            balance += eklenecekTutar;
                        }
                        case 2 -> {
                            System.out.print("Lutfen çekmek istediğiniz tutarı giriniz: ");
                            cekilecekTutar = input.nextInt();

                            if (cekilecekTutar > balance) {
                                System.out.print("Yetersiz Bakiye..");
                            }

                            balance -= cekilecekTutar;
                        }
                        case 3 -> System.out.println("Güncel bakiyeniz: " + balance);
                        case 4 -> System.out.println("Tekrar görüşmek üzere ...");
                        default -> System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere ...");
                break;
            } else {
                right--;
                System.out.println("Hatalı şifre veya Kuallanıcı adı girildi. Tekrar deneyiniz...");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.. Lutfen banka ile iletişime geçiniz!");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
