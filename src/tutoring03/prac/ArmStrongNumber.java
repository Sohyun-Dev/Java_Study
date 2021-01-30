package tutoring03.prac;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == getArmString(num)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static int getArmString(int num){
        int sum = 0;

        int first = num /100;
        int second = (num%100) /10;
        int third = num % 10;
        sum = first* first * first + second * second * second + third * third * third;
        return sum;
    }
}
