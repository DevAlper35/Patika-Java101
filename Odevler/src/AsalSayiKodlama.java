public class AsalSayiKodlama {
    public static void main(String[] args) {


        int x, sum = 0;

        System.out.print("1-100 arası asal sayılar");

        for (int i = 1; i <= 100; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                x = i % j;

                if (x == 0) {
                    sum += j;
                }
            }

            if ((i + 1) == sum) {
                System.out.print(", " +i);
            }
        }
    }
}
