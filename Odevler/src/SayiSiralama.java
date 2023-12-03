import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[]args){
        // Girilen 3 sayıyı küçükten büyüğe sıralayan kodlama
        Scanner input = new Scanner(System.in);
        System.out.print("A: "); int a = input.nextInt();
        System.out.print("B: "); int b = input.nextInt();
        System.out.print("C: "); int c = input.nextInt();
        String sira;
        if(a<b && a<c){
            sira = b<c?"A < B < C":"A < C < B";
        }else if(b<a && b<c){
            sira = a<c?"B < A < C":"B < C < A";
        }else{
            sira = a<b?"C < A < B":"C < B < A";
        }
        System.out.println(sira);
    }
}
