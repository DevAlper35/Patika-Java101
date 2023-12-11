import java.util.Scanner;

public class basamakSayilarininToplaminiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, numberCounter=0, result=0, NumberT, stepVal;
        System.out.print("Sayı girin: ");
        number = input.nextInt();
        NumberT = number;
        while(NumberT!=0)
        {
            NumberT = NumberT / 10;
            numberCounter++;
        }       
        System.out.println("Basamak Sayısı: "+ numberCounter);

        NumberT = number;
        while(NumberT!=0)
        {
            stepVal=NumberT%10;
            result += stepVal;
            NumberT = NumberT / 10;
        }
        System.out.println("Basamak Sayıların Toplamı: "+ result);
        
    }  
}
