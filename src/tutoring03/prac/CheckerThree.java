package tutoring03.prac;

import java.util.Scanner;

public class CheckerThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers [] = new int[10];
        for(int i=0;i<10;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("3의 배수");
        for(int i=0;i< 10;i++){
            if (numbers[i] % 3 == 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
