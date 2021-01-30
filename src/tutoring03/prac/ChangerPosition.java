package tutoring03.prac;

import java.util.Scanner;

public class ChangerPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[]{10, 20, 30, 50, 3, 60, -3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
