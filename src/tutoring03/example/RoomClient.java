package tutoring03.example;

public class RoomClient {
    public static void main(String[] args) {
        OneRoom oneRoom = new OneRoom(121, "ONE");
        TwoRoom twoRoom = new TwoRoom(819, "TWO");

        oneRoom.printNumber();
        twoRoom.printNumber();

        oneRoom.printType();
        twoRoom.printType();
    }
}
