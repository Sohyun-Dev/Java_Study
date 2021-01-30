package tutoring03.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FileInputer {

    public String input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명과 확장자명을 입력하세요.");
        String input = sc.nextLine();
        return input;
    }


}
