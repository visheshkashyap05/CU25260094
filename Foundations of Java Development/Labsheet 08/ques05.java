class Product<T, U> {
    private T productId;
    private U productPrice;

    Product(T productId, U productPrice) {
        this.productId = productId;
        this.productPrice = productPrice;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Price: " + productPrice);
        System.out.println();
    }
}

public class ques05 {
    public static void main(String[] args) {
        Product<Integer, Double> p1 =
                new Product<>(101, 499.99);

        Product<Integer, Double> p2 =
                new Product<>(102, 799.50);

        Product<Integer, Double> p3 =
                new Product<>(103, 1299.00);

        p1.display();
        p2.display();
        p3.display();
    }
}