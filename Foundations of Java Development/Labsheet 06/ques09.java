public class ques09 {

    static void method3() {
        int result = 10 / 0;
        System.out.println(result);
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main().");
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
