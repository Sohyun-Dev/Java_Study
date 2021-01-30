package tutoring03.prac;

import java.util.Scanner;

public class CheckerClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Checker checker = new Checker();
        Boolean result = checker.check(input);
        System.out.println(result);

    }
}
