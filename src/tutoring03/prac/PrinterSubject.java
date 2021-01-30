package tutoring03.prac;

import java.util.Scanner;

public class PrinterSubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subject[] subject = new Subject[5];
        subject[0] = new Subject("국어", 100);
        subject[1] = new Subject("수학", 90);
        subject[2] = new Subject("영어", 80);
        subject[3] = new Subject("사회", 70);
        subject[4] = new Subject("과학", 60);

        while (true) {
            String sub = sc.nextLine();
            if (sub.equals("stop")) {
                break;
            } else {
                for (int i = 0; i < subject.length; i++) {
                    if(sub.equals(subject[i].name)){
                        System.out.println(sub + " : " + subject[i].score + "점");
                    }

                }
            }
        }
    }
}
