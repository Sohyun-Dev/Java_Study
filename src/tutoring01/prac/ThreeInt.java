package tutoring01.prac;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ThreeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개 입력 : ");
        int max = 0, min = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3)
            max = num1;
        else if (num2 > num1 && num2 > num3)
            max = num2;
        else if (num3 > num2 && num3 > num1)
            max = num3;

        if (num1 < num2 && num1 < num3)
            min = num1;
        else if (num2 < num1 && num2 < num3)
            min = num2;
        else if (num3 < num2 && num3 < num1)
            min = num3;

        int sum = num1 + num2 + num3;
        int avg = sum / 3;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
