package tutoring01.prac;

public class MethodE {
    public static void main(String[] args) {
        printE();
    }

    public static void printE(){
        int sum = 0;
        for (int i = 0; i <= 100 ; i = i+2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
