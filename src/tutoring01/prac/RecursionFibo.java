package tutoring01.prac;

import java.util.Scanner;

public class RecursionFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1개 입력: ");
        int num1 = sc.nextInt();
        System.out.println(Fibo(num1));
    }

    public static int Fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Fibo(n - 1) + Fibo(n - 2);
    }
}
