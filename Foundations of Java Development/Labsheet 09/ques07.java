import java.util.ArrayList;
import java.util.Collections;
public class ques07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30); numbers.add(10); numbers.add(50); numbers.add(20); numbers.add(10); numbers.add(40);
        System.out.println("Original List: " + numbers);
        Collections.sort(numbers); System.out.println("After sort(): " + numbers);
        Collections.reverse(numbers); System.out.println("After reverse(): " + numbers);
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
        System.out.println("Frequency of 10: " + Collections.frequency(numbers, 10));
    }
}
