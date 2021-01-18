package tutoring02.prac;

public class Square {
    private double garo;
    private double saero;

    public Square(double garo, double saero) {
        this.garo = garo;
        this.saero = saero;
    }

    public Boolean isSquare() {
        return garo == saero;
    }
}
