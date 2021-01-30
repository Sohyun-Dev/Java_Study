package tutoring03.homework.TiketSellingSystem;

public class Bag {
    private int money;
    private int invitation;
    private int ticket;

    public int hold(Ticket ticket) {
        if(invitation>0){
            return invitation;
        }
        else{
            consume(ticket);
            return ticket.getPrice();
        }
    }

    private void consume(Ticket ticket){
        money -= ticket.getPrice();
    }
}
