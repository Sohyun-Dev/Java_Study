package tutoring01.homework;

import java.util.Scanner;

public class PositiveSum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();
            if (num > 0) {
                sum = sum + num;
            }
        }
        System.out.println("합계 : " + sum);

    }
}
