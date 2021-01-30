package tutoring03.homework.TiketSellingSystem;

public class TicketSeller {
    TicketOffice ticketOffice;

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
