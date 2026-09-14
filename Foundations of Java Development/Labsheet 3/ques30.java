import java.util.Scanner;

class ques30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        int zeroCount = 0;
        int nonZeroCount = 0;

        System.out.println("Enter elements of 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        System.out.println("Number of zero elements = " + zeroCount);
        System.out.println("Number of non-zero elements = " + nonZeroCount);

        if (zeroCount > nonZeroCount) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is not a sparse matrix.");
        }

        sc.close();
    }
}
