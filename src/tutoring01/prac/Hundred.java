package tutoring01.prac;

public class Hundred {
    public static void main(String[] args) {
        int num = 100;
        if (num % 2 == 0)
            System.out.println("짝수");
        else
            System.out.println("홀수");
        if (num > 0)
            System.out.println("양수");
        else if (num < 0)
            System.out.println("음수");
        else
            System.out.println("0");
    }
}
