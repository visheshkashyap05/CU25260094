class Triangle {
    double a;
    double b;
    double c;

    static String type = "Scalene/Isosceles/Equilateral";

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void checkValidity() {
        boolean valid = (a + b > c) &&
                        (b + c > a) &&
                        (a + c > b);

        System.out.println("Triangle Type Options: " + type);

        if (!valid) {
            System.out.println("Invalid Triangle");
        } else if (a == b && b == c) {
            System.out.println("Valid Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Valid Isosceles Triangle");
        } else {
            System.out.println("Valid Scalene Triangle");
        }
    }
}

public class ques16 {
    public static void main(String[] args) {
        Triangle t = new Triangle(5, 5, 6);
        t.checkValidity();
    }
}
