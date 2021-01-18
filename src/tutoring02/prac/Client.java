package tutoring02.prac;

public class Client {
    public static void main(String[] args) {
        Iam printer = new Iam(); // Client가 Printer한테 printIAm좀 해달라고 함
        printer.printIam();

        AdderTwo adderTwo = new AdderTwo(); // Client가 AdderTwo에게 두 수의 합을 print해달라고 메세지를 보냄
        int sum = adderTwo.sum(10,100);
        System.out.println(sum);

        Calculator calculator = new Calculator();
        int sumSub = calculator.sumSubject(50, 20, 50);
        int avgSub = calculator.avgSubject(50, 80, 90);
        System.out.println(sumSub + " " + avgSub);
    }
}
