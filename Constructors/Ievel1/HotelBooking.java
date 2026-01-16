package Constructors.Ievel1;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;


    HotelBooking() {
        this("Unknown", "Standard", 1); // constructor chaining
    }


    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Nakul", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.displayBooking();
        b2.displayBooking();
        b3.displayBooking();
    }
}

