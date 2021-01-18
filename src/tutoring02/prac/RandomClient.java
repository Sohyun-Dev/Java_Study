package tutoring02.prac;

public class RandomClient {
    public static void main(String[] args) throws Exception{
        int randomNum = (int)(Math.random()*100)+1;
        RandomTester randomTester = new RandomTester(randomNum);
        randomTester.checkNum();
    }
}
