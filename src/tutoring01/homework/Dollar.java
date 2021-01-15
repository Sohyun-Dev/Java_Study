package tutoring01.homework;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        double oneDollar = 1092.20;

        Scanner sc = new Scanner(System.in);
        System.out.print("달러 입력: ");
        double dollars = sc.nextDouble();
        double won = dollars * oneDollar;
        System.out.println("원화 변경 : " + won);
    }
}
