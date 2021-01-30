package tutoring03.example;

public class StringExample {
    public static void main(String[] args) {
        Person chulsu = new Person(10, "Chulsu");
        int age = chulsu.getAge();
        System.out.println(age);

        String name = "psh";
        String address = "seoul";

        String result = name.concat(address);
        System.out.println(result);

        String apple = "apple";
        int length = apple.length();
        System.out.println(length);
    }
}
