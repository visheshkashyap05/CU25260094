class Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        double area = length * breadth;

        System.out.println("Shape: " + shapeName);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }
}

public class ques02 {
    public static void main(String[] args) {
        double l = 10;
        double b = 5;

        Rectangle r = new Rectangle(l, b);
        r.calculateArea();
    }
}
