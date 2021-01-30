package tutoring03.homework.TiketSellingSystem;

public class TicketOffice {
    private Ticket ticket;
    private int money;

    public void sellTicketTo(Audience audience) {
        money += audience.buy(ticket);
    }
}
