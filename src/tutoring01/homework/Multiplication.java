package tutoring01.homework;

public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d =  %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
