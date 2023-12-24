import java.util.Arrays;
import java.util.Scanner;

public class ArraySiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyunu girin: ");
        int arrLen = input.nextInt();
        int[] arr= new int[arrLen];
        for(int i=0; i<arrLen;i++){
            System.out.print((i+1)+ ". elemanı girin: ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
