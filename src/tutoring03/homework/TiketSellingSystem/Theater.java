package tutoring03.homework.TiketSellingSystem;

public class Theater {
    TicketSeller ticketSeller;

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}
