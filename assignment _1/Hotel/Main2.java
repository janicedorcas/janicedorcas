import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        String Id;
        while (true) {
            System.out.println("Enter Guest Id:");
            Id = scanner.nextLine();
            if (Id.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid ID. Please enter numbers only.");
            }
        }

        
        String Name;
        while (true) {
            System.out.println("Enter Guest Name (letters only):");
            Name = scanner.nextLine();
            if (Name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please enter letters only.");
            }
        }

        System.out.println("Enter Room type(STANDARD, DELUXE, SUITE:)");
        String roomType = scanner.nextLine();

        System.out.println("Enter number of stay days:");
        int Days = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Room status (AVAILABLE/OCCUPIED):");
        String status = scanner.nextLine().toUpperCase();

        System.out.println("Choose a Service:");
        System.out.println("1. Book Room");
        System.out.println("2. Checkout Guest");
        System.out.println("3. Generate Bill");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                RoomBooking booking = new RoomBooking(Id, Name, status, roomType, Days);
                booking.bookRoom();
                break;

            case 2:
                GuestCheckout checkout = new GuestCheckout(Id, Name, status, roomType, Days);
                checkout.checkoutGuest();
                break;

            case 3:
                Billing billing = new Billing(Id, Name, status, roomType, Days);
                billing.generateBill();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
