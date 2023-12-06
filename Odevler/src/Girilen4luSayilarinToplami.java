import java.util.Scanner;
public class Girilen4luSayilarinToplami {
    public static void main(String[] args) {
        int numberInput, toplam=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Sayı Girin: ");numberInput = input.nextInt();
            if(numberInput%4==0){
                toplam+=numberInput;
            }
        }while(numberInput%2==0);
        System.out.println("Sonuç: " + toplam);
    }
}
