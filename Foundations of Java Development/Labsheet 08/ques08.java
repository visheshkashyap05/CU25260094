public class ques08 {

    public static <T> void displayThree(T a, T b, T c) {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        System.out.println("Integers:");
        displayThree(10, 20, 30);

        System.out.println("Strings:");
        displayThree("Java", "Python", "C++");

        System.out.println("Doubles:");
        displayThree(10.5, 20.5, 30.5);
    }
}