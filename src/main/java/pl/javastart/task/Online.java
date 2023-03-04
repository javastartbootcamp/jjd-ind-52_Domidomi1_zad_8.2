package pl.javastart.task;

import org.w3c.dom.ls.LSOutput;

public class Online extends Ticket {

    private int discount;

    public Online(String ticketName, String ticketPlace, String typeOfTicket, int ticketPrice,
                  int ticketNumber, int discount) {
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
        return getTicketPrice() - discount;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.print(" Zniżka " + discount + "zł. Całkowita kwota do zapłaty po zniżce: " + finalPayment());
    }
}
