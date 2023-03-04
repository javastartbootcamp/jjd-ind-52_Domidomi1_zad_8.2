package pl.javastart.task;

public class Standard extends Ticket {

    private int discount;
    private static int PRINT = 5;

    public Standard(String ticketName, String ticketPlace, String typeOfTicket,
                    int ticketPrice, int ticketNumber, int discount) {
        super(ticketName, ticketPlace, typeOfTicket, ticketPrice, ticketNumber);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    int finalPayment() {
        return getTicketPrice() - discount - PRINT;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.print(" Zniżka " + discount + "zł. Całkowita kwota do zapłaty po zniżce: " + finalPayment());
    }
}