package tutoring02.example;

public class ObjectExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCreatedAt(20200113);
        System.out.println(computer.getCreatedAt());

        computer.setCreatedAt(20210123);
        System.out.println(computer.getCreatedAt());

    }
}
