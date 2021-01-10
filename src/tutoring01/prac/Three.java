package tutoring01.prac;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();
        if ( num % 3 == 0)
            System.out.println("3의 배수임");
        else
            System.out.println("3의 배수가 아님");
    }
}
