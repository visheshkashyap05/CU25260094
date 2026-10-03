class Matrix {
    int[][] matrix;
    static String matrixType = "2x2 Matrix";

    Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    static void add(Matrix m1, Matrix m2) {
        int[][] result = new int[2][2];

        System.out.println("Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void subtract(Matrix m1, Matrix m2) {
        int[][] result = new int[2][2];

        System.out.println("Subtraction:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class ques26 {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        System.out.println("Matrix Type: " + Matrix.matrixType);

        Matrix.add(m1, m2);
        Matrix.subtract(m1, m2);
    }
}
