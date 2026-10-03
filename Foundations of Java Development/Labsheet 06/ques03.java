public class ques03 {
    public static void main(String[] args) {
        String number = "abc";

        try {
            int value = Integer.parseInt(number);
            System.out.println("Integer value = " + value);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string is not a valid integer.");
        }
    }
}
