package tutoring03.prac;

import java.util.Scanner;

public class ChangerPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        String newPhoneNumber = phoneNumber.replace('-','_');
        System.out.println(newPhoneNumber);
    }
}
