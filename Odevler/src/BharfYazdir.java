public class BharfYazdir {
    public static void main(String[] args) {
        String[][] writingB = new String[7][4];
        for (int i = 0 ; i < writingB.length ; i++){
            for (int j = 0 ; j < writingB[i].length ; j++){
                if (i == 3 && j == 3 || i == 0 && j == 3 || i == 6 && j == 3 )
                    writingB[i][j] = " ";
                else if (i == 0 || i == 6 || i == 3)
                    writingB[i][j] = " * ";
                else if (j == 0 || j == 3)
                    writingB[i][j] = " * ";
                else
                    writingB[i][j] = "   ";
            }
        }
        for (String[] row: writingB) {
            for (String col: row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
