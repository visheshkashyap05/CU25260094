class Person {
    String name;
    int age;
    static String country = "India";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkEligibility() {
        int minimumAge = 18;
        boolean eligible = age >= minimumAge;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (eligible) {
            System.out.println("Eligible for voting.");
        } else {
            System.out.println("Not eligible for voting.");
        }
    }
}

public class ques14 {
    public static void main(String[] args) {
        Person p = new Person("Aman", 20);
        p.checkEligibility();
    }
}
