public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight("KZ101", "Almaty", "Astana", 100);


        Passenger passenger = new Passenger("Rafael Shayekhov");


        if (flight.bookSeat()) {
            Booking booking = new Booking(passenger, flight);
            System.out.println(booking);
        } else {
            System.out.println("No seats available for flight: " + flight);
        }
    }
}
