import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık girin: "); byte heat = input.nextByte();

        if (heat < 5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }else if (heat < 15){
            System.out.println("Sinema izlemeye gidebilirsiniz");
        }else if (heat < 25){
            System.out.println("Piknik yapmaya gidebilirsiniz");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
