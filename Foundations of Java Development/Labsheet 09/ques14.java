import java.util.ArrayList;
import java.util.LinkedList;
public class ques14 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        arrayList.add("Java"); arrayList.add("Python"); arrayList.add("C++");
        linkedList.add("Java"); linkedList.add("Python"); linkedList.add("C++");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("\nArrayList get(1): " + arrayList.get(1));
        System.out.println("LinkedList get(1): " + linkedList.get(1));
        System.out.println("\nArrayList Size: " + arrayList.size());
        System.out.println("LinkedList Size: " + linkedList.size());
        arrayList.remove("Python"); linkedList.remove("Python");
        System.out.println("\nAfter deletion:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("\nArrayList Iteration:");
        for (String item : arrayList) System.out.println(item);
        System.out.println("\nLinkedList Iteration:");
        for (String item : linkedList) System.out.println(item);
        System.out.println("\nComparison Table:");
        System.out.println("Operation       ArrayList        LinkedList");
        System.out.println("Insertion       Supported        Supported");
        System.out.println("Deletion        Supported        Supported");
        System.out.println("get()           Supported        Supported");
        System.out.println("size()          Supported        Supported");
        System.out.println("Iteration       Supported        Supported");
    }
}
