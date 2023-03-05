package pl.javastart.task;

public class Ticket {

    private String ticketName;
    private String ticketPlace;
    private String typeOfTicket;
    private int ticketPrice;
    private int ticketNumber;

    public Ticket(String ticketName, String ticketPlace, String typeOfTicket, int ticketPrice, int ticketNumber) {
        this.ticketName = ticketName;
        this.ticketPlace = ticketPlace;
        this.typeOfTicket = typeOfTicket;
        this.ticketPrice = ticketPrice;
        this.ticketNumber = ticketNumber;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketPlace() {
        return ticketPlace;
    }

    public void setTicketPlace(String ticketPlace) {
        this.ticketPlace = ticketPlace;
    }

    public String getTypeOfTicket() {
        return typeOfTicket;
    }

    public void setTypeOfTicket(String typeOfTicket) {
        this.typeOfTicket = typeOfTicket;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    void printInfo() {
        System.out.print(ticketName + " in " + ticketPlace + ", is " + typeOfTicket + ", for " + ticketPrice + ".");
    }
}