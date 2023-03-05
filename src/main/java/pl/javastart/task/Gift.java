package pl.javastart.task;

public class Gift extends Ticket {

    private int discount;
    private static int PRINT = 5;

    public Gift(String ticketName, String ticketPlace, String typeOfTicket,
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

    double finalPayment() {
        return ((getTicketPrice() - discount) - PRINT - (getTicketPrice() * 0.05));
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.print(" Zniżka " + discount + "zł. Całkowita kwota do zapłaty po zniżce: " + finalPayment());
    }
}