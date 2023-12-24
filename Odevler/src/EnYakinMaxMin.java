import java.util.Arrays;

public class EnYakinMaxMin {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int n = 5;

        int smallElement = Integer.MAX_VALUE;
        int largeElement = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element < n && n - element < n - smallElement) {
                smallElement = element;
            } else if (element > n && element - n < largeElement - n) {
                largeElement = element;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.println("Girilen Sayı: " + n);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallElement);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + largeElement);
    }
}