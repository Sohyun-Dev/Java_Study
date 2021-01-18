package tutoring02.prac;

public class Client2 {
    public static void main(String[] args) {
        Song song = new Song("abc", "yonghee");

        Square square = new Square(10, 15);
        Boolean result = square.isSquare();
        System.out.println(result);

        Book chulsu = new Book(2021, "chulsu", 12345);
        chulsu.is2021();

        System.out.println();


    }
}
