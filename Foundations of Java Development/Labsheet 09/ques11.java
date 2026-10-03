import java.util.TreeSet;
public class ques11 {
    public static void main(String[] args) {
        TreeSet<Integer> studentIds = new TreeSet<>();
        int[] values = {105,101,103,102,105,104,101};
        for (int value : values) studentIds.add(value);
        System.out.println("Unique Sorted Student IDs: " + studentIds);
        System.out.println("First ID: " + studentIds.first());
        System.out.println("Last ID: " + studentIds.last());
        System.out.println("Higher than 103: " + studentIds.higher(103));
        System.out.println("Lower than 103: " + studentIds.lower(103));
    }
}
