import java.util.Scanner;

class Ticket
{
    int ticketId;
    String passengername;
    String source;
    String destination;
    int seatnumber;
    double fare;
    String status;
    Ticket(int ticketId,String passengername,String source,String destination,int seatnumber,double fare)
    {
        this.ticketId=ticketId;
        this.passengername=passengername;
        this.source=source;
        this.destination=destination;
        this.seatnumber=seatnumber;
        this.fare=fare;
        this.status="Confirmed";
    }
    void displayTicket()
    {
        System.out.println("\n=================================");
        System.out.println("         TICKET DETAILS");
        System.out.println("=================================");
        System.out.println("Ticket ID       :"+ticketId);
        System.out.println("Passenger Name:"+passengername);
        System.out.println("Source          :"+source);
        System.out.println("Destination     :"+destination);
        System.out.println("Seat Number     :"+seatnumber);
        System.out.println("Fare            :"+fare);
        System.out.println("Booking Status  :"+status);
        System.out.println("=================================");

}
}
class User
{
    private final int pin = 1234;

    boolean login(Scanner sc) {
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("Login Successful!");
            return true;
        }

        System.out.println("Invalid PIN!");
        return false;
    }
}
class TicketBookingSystem
{
    Ticket[] tickets;
    int count;
    int totalSeats;
    double totalRevenue;
    int nextTicketId;
    int nextSeatNumber;
    TicketBookingSystem(int totalSeats) {
        this.totalSeats = totalSeats;
        tickets = new Ticket[totalSeats];
        count = 0;
        totalRevenue = 0;
        nextTicketId = 1001;
        nextSeatNumber=1;
    }
    void bookTicket(Scanner sc)
    {
        if (count >= totalSeats) {
            System.out.println("No seats available!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Fare: ");
        double fare = sc.nextDouble();
        int ticketId = nextTicketId++;
        int seatNumber =nextSeatNumber++;
        tickets[count]=new Ticket(ticketId,name,source,destination,seatNumber,fare);
        count++;
        totalRevenue+=fare;
        System.out.println("\nTicket Booked Successfully!");
        System.out.println("Ticket ID : " + ticketId);
        System.out.println("Seat No   : " + seatNumber);
    }
    void viewAllTickets() {

        if (count == 0) {
            System.out.println("No tickets booked.");
            return;
        }
        for (int i = 0; i < count; i++) {
            tickets[i].displayTicket();
        }
    }
    void searchTicket(Scanner sc) {

        if (count == 0) {
            System.out.println("No tickets booked.");
            return;
        }
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (tickets[i].ticketId == id) {
                tickets[i].displayTicket();
                return;
            }
        }
        System.out.println("Ticket Not Found.");
    }
    void cancelTicket(Scanner sc) {
        if (count == 0) {
            System.out.println("No tickets booked.");
            return;
        }
        System.out.print("Enter Ticket ID to Cancel: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (tickets[i].ticketId == id) {
                totalRevenue -= tickets[i].fare;
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[count - 1] = null;
                count--;
                System.out.println("Ticket Cancelled Successfully.");
                return;
            }
        }
        System.out.println("Ticket Not Found.");
    }
    void availableSeats() {
        System.out.println("Available Seats : " + (totalSeats - count));
    }

    void showRevenue() {
        System.out.println("Total Revenue : ₹" + totalRevenue);
    }
}
public class TicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User();

        if (!user.login(sc)) {
            return;
        }

        TicketBookingSystem system = new TicketBookingSystem(50);

        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Available Seats");
            System.out.println("6. Total Revenue");
            System.out.println("7. Exit");
            System.out.println("==========================");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    system.bookTicket(sc);
                    break;

                case 2:
                    system.viewAllTickets();
                    break;

                case 3:
                    system.searchTicket(sc);
                    break;

                case 4:
                    system.cancelTicket(sc);
                    break;

                case 5:
                    system.availableSeats();
                    break;

                case 6:
                    system.showRevenue();
                    break;

                case 7:
                    System.out.println("Thank You for Using the System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}

    

    