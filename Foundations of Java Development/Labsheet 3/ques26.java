import java.util.Scanner;

class ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i <= j) {
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j) {
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
