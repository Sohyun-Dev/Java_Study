package tutoring01.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 성적 입력 : ");
        int Korean = sc.nextInt();
        System.out.print("영어 성적 입력 : ");
        int English = sc.nextInt();
        System.out.print("수학 성적 입력 : ");
        int Math = sc.nextInt();
        double average = (Korean + English + Math) / 3;
        if (average >= 80) {
            System.out.println("성적 : 우");
        } else if (average >= 70) {
            System.out.println("성적 : 미");
        } else if (average >= 60) {
            System.out.println("성적 : 양");
        } else {
            System.out.println("성적 : 가");
        }
    }
}
