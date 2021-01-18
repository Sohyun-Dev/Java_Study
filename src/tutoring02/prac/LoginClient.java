package tutoring02.prac;

import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws WrongIdException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id");
        String id = scanner.nextLine();
        System.out.println("enter pwd");
        String password = scanner.nextLine();
        LoginManager loginManger = new LoginManager();
        loginManger.login(id, password);
    }
}
