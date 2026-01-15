package javaOOPS.level2;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    void bookTicket(int seatNumber, double price) {
        if (isBooked) {
            System.out.println("Ticket already booked!");
            return;
        }
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = true;
        System.out.println("Ticket booked successfully.");
    }

    void displayTicketDetails() {
        if (!isBooked) {
            System.out.println("Ticket not booked yet.");
            return;
        }
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");

        ticket.displayTicketDetails();
        ticket.bookTicket(12, 250);
        ticket.displayTicketDetails();
        ticket.bookTicket(15, 300);         // should fail
    }
}

