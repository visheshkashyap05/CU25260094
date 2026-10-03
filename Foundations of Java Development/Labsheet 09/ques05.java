import java.util.TreeSet;
public class ques05 {
    public static void main(String[] args) {
        TreeSet<Integer> rollNumbers = new TreeSet<>();
        int[] values = {105,102,110,101,108,103,107,104,109,106};
        for (int value : values) rollNumbers.add(value);
        System.out.println("Sorted Roll Numbers:");
        System.out.println(rollNumbers);
    }
}
