import java.util.ArrayList;
import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        int number = sc.nextInt();

        if (numbers.contains(number)) {
            System.out.println(number + " exists in the list.");
        } else {
            System.out.println(number + " does not exist in the list.");
        }

        sc.close();
    }
}