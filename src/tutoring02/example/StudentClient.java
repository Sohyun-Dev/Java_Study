package tutoring02.example;

public class StudentClient {
    public static void main(String[] args) {
        Student yonghee = new Student("yonghee", 1);
        Student chulsu = new Student("chulsu", 5);

        yonghee.study();
        chulsu.study();
    }
}
