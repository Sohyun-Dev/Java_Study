package tutoring01.prac;

import java.util.Scanner;

public class MethodMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(max(num1, num2, num3));
    }

    public static int max(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3)
            return num1;
        else if (num2 > num3 && num2 > num1)
            return num2;
        else
            return num3;
    }
}
