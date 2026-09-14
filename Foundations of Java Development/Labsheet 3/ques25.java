import java.util.Scanner;

class ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int mainSum = 0;
        int secondarySum = 0;

        System.out.println("Enter elements of 3 x 3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            mainSum += matrix[i][i];
            secondarySum += matrix[i][2 - i];
        }

        System.out.println("Sum of main diagonal = " + mainSum);
        System.out.println("Sum of secondary diagonal = " + secondarySum);

        sc.close();
    }
}
