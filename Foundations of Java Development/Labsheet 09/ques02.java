import java.util.ArrayList;
public class ques02 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85); marks.add(90); marks.add(78); marks.add(92); marks.add(88);
        System.out.println("First Element: " + marks.get(0));
        System.out.println("Middle Element: " + marks.get(2));
        System.out.println("Last Element: " + marks.get(4));
    }
}
