import java.util.ArrayList;

public class ques14 {

    public static <T> void displayList(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Neha");

        System.out.println("Integer List:");
        displayList(numbers);

        System.out.println("\nString List:");
        displayList(names);
    }
}