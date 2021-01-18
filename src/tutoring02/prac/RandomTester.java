package tutoring02.prac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomTester {

    private int random;
    private int input;

    public RandomTester(int random){
        this.random = random;
        input = getNum();
    }

    public static int getNum(){
        int inputNum=0;
        try{
            Scanner sc = new Scanner(System.in);
            inputNum = sc.nextInt();
        } catch(InputMismatchException ie){
            System.out.println("숫자를 입력해주세요");
            return getNum();
        }
        return inputNum;
    }

    public void checkNum(){
        while (true){
            if(random == input){
                System.out.println("맞습니다");
                break;
            }
            else if(random < input){
                System.out.println("더 작은 수를 입력하세요");
                input = getNum();
            }
            else if (random>input){
                System.out.println("더 큰 수를 입력하세요");
                input = getNum();
            }
        }

    }
}
