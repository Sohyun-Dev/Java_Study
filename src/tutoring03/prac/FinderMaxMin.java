package tutoring03.prac;

public class FinderMaxMin {
    public static void main(String[] args) {
        int[] listNum = {94, 85, 95, 88, 90};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] > max) {
                max = listNum[i];
            }
            if (listNum[i] < min) {
                min = listNum[i];
            }
        }
        System.out.println("max : " + max + " min : " + min);
    }
}
