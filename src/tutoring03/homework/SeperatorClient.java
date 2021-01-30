package tutoring03.homework;

public class SeperatorClient {
    public static void main(String[] args) {
        FileInputer fileInputer = new FileInputer();
        SeperatorFileName seperatorFileName = new SeperatorFileName(fileInputer.input());
        seperatorFileName.seperate();
    }
}
