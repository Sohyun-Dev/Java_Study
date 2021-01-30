package tutoring03.homework.TiketSellingSystem;

public class Audience {
    Bag bag;
    public int buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
