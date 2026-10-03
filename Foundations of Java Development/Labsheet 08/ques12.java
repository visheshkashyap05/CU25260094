class Container<T> {
    private T value;

    public void add(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class ques12 {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        intContainer.add(100);

        Container<String> stringContainer = new Container<>();
        stringContainer.add("Hello");

        Container<Double> doubleContainer = new Container<>();
        doubleContainer.add(99.99);

        System.out.println("Integer: " + intContainer.get());
        System.out.println("String: " + stringContainer.get());
        System.out.println("Double: " + doubleContainer.get());
    }
}