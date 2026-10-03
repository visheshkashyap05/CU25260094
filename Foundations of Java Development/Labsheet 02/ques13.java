import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = Character.isDigit(ch)
                ? "Digit"
                : (Character.isLetter(ch)
                    ? ((ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U')
                        ? "Vowel" : "Consonant")
                    : "Special Symbol");

        System.out.println("Character type = " + result);

        sc.close();
    }
}