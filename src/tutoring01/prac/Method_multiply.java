package tutoring01.prac;

import java.util.Scanner;

public class Method_multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 2개 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(multiply(num1, num2));

    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
}
