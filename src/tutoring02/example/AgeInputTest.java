package tutoring02.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeInputTest {
    public static void main(String[] args) throws AgeInputException {
        int age = getAge();
        System.out.println("age : " + age);
    }

    private static int getAge() throws AgeInputException {
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            return age;
        } catch (InputMismatchException e) {
            System.out.println("This is AgeInputException");
            throw new AgeInputException();
        }
    }
}
