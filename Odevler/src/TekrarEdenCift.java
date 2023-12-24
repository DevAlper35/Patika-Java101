import java.util.Arrays;

public class TekrarEdenCift {
    public static void main(String[] args) {

        int[] array = {2, 7, 3, 3, 2, 9, 10, 10, 1, 33, 12,12,10,7,8,4,23,14,4,1234,123,4,13,14};
        Arrays.sort(array);
        System.out.print("Repeating Numbers :");
        for (int i = 1 ; i < array.length ; i++){
            if (array[i] == array[i-1] ){
                if (array[i] != array[i+1] )
                    if (array[i]%2==0)
                        System.out.print(" " + array[i] );
            }
        }
    }
}
