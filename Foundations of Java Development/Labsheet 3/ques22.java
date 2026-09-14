import java.util.Scanner;

class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        boolean[] visited = new boolean[6];

        System.out.println("Enter 6 elements:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Frequency of elements:");

        for (int i = 0; i < 6; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < 6; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " appears " + count + " time(s)");
        }

        sc.close();
    }
}
