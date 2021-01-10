package tutoring01.prac;

import java.util.Scanner;

public class RecursionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1개 입력: ");
        int num1 = sc.nextInt();
        System.out.println(sum(num1));

    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + (sum(n - 1));
        }
    }
}
