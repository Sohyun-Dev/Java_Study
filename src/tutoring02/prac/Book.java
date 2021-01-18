package tutoring02.prac;

public class Book {
    private int year;
    private String author;
    private int isbn;

    public Book(int year, String author, int isbn) {
        this.year = year;
        this.author = author;
        this.isbn = isbn;
    }

    public void is2021() {
        if (year == 2021) {
            System.out.println("출판년도가 2021년이 맞습니다");
        } else {
            System.out.println("출판년도가 2021년이 아닙니다");
        }
    }
}
