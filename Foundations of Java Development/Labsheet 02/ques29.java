import java.util.Random;

public class ques29 {
    public static void main(String[] args) {
        Random random = new Random();

        int count = 0;

        while (true) {
            int num = random.nextInt(100) + 1;
            count++;

            System.out.println("Generated number: " + num);

            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Number divisible by both 7 and 13 found: " + num);
                break;
            }
        }

        System.out.println("Numbers generated = " + count);
    }
}