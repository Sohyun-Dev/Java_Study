package tutoring02.homework;

public class Bag {
    int money;
    int invitation;
    int ticket;

    public int enter(){
        if(invitation>0){
            return invitation;
        }
        else{
            return ticket;
        }

    }
}
