public class PracOne {
    public static void CountSeven(int mat[][]) {
        int countSev = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 7) {
                    countSev++;
                }
            }
        }
        System.out.println("No. of sevens in matrix: " + countSev);
    }

    public static void sumRow(int matrix[][]) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println("Sum of 2nd row: " + sum);
    }
    public static void main(String[] args) {
        // int mat[][] = {{4,7,8},{8,8,7}};
        // CountSeven(mat);
        int row = 3, col = 3;
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println("Original matrix: ");
        PrintMat(matrix);
        // sumRow(matrix);
    }
}
