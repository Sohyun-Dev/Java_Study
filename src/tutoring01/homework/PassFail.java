package tutoring01.homework;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 성적 입력 : ");
        int Korean = sc.nextInt();
        System.out.print("영어 성적 입력 : ");
        int English = sc.nextInt();
        System.out.print("수학 성적 입력 : ");
        int Math = sc.nextInt();
        int sum = Korean + English + Math;
        if (sum < 210) {
            System.out.println("탈락");
        } else if (Korean < 60 || English < 60 || Math < 60) {
            System.out.println("탈락");
        } else {
            System.out.println("합격");
        }
    }
}
