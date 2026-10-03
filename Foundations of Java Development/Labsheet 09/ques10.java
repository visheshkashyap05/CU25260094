import java.util.ArrayList;
import java.util.HashSet;
public class ques10 {
    public static void main(String[] args) {
        int[] values = {10,20,10,30,20,40,50};
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int value : values) { list.add(value); set.add(value); }
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
        System.out.println("\nDifference:");
        System.out.println("ArrayList allows duplicate values.");
        System.out.println("HashSet removes duplicate values.");
        System.out.println("ArrayList maintains insertion order.");
        System.out.println("HashSet does not guarantee ordering.");
    }
}
