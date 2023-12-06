import java.util.Scanner;
public class UcDortOrtalama {
    // 0'dan girilen sayıya kadar olan sayılardan, 3 ve 4e tam bölünen sayıların ortalamasını hesaplayan kod
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0,bolunenler=0, i =1, numberInput, result;
        System.out.print("Sayı girin: "); numberInput = input.nextInt();
        while(i <=numberInput){
            if(i%3==0 && i%4==0){
                bolunenler +=i;
                counter++;
                System.out.println(i);
            }
            i++;
        }
        result = bolunenler / counter;
        System.out.println("Sonuç: " + result);
    }
}
