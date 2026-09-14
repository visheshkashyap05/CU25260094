import java.util.Scanner;

public class ques06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("ASCII value of " + ch + " is: " + ascii);

        sc.close();
    }
}