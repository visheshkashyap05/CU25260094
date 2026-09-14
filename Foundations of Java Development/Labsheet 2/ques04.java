public class ques04 {
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Initial visitors = " + visitors);

        System.out.println("Postfix increment: " + visitors++);
        System.out.println("After postfix increment = " + visitors);

        System.out.println("Prefix increment: " + ++visitors);
        System.out.println("After prefix increment = " + visitors);

        System.out.println("Visitors leaving: " + visitors--);
        System.out.println("After visitor leaves = " + visitors);
    }
}