package tutoring01;

public class HelloScope {
    public static void main(String[] args) {
        boolean flag = true;

        if (flag) {
            int num = 100;
            System.out.println(num);
        } else {
            int num = 1000;
            System.out.println(num);
        }
    }
}
