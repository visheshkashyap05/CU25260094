class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class ques01 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> stringBox = new Box<>("Hello Java");
        Box<Double> doubleBox = new Box<>(99.99);

        System.out.println("Integer Value: " + intBox.getValue());
        System.out.println("String Value: " + stringBox.getValue());
        System.out.println("Double Value: " + doubleBox.getValue());
    }
}