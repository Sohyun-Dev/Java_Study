package tutoring01.prac;

public class ForThree {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}