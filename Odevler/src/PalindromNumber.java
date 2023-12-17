import java.util.Scanner;
// Bu kodlama girilen sayının Palindrom olup olmadığını tespit eder.
// Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
public class PalindromNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int number = input.nextInt();
        System.out.println(IsPalindrom(number));
    }

    static String IsPalindrom (int number){
        int reverseNumber=0, temp = number, lastNumber;
        String result;
        while (temp != 0){
            lastNumber = temp%10; // Girilen sayının son basamağını alıyoruz
            temp /=10;
            reverseNumber = (reverseNumber * 10) + lastNumber; //reverseNumber değişkenine girilen sayının ters hali basamak basamak ekleniyor
        }
        if (reverseNumber == number){
            result = "Girilen sayı Palindrom sayıdır";
        }else{
            result = "Girilen sayı Palindrom sayı değildir";
        }
        return result;
    }
}
