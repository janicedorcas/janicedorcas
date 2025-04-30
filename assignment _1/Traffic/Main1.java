import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String driverId;
        while (true) {
            System.out.print("Enter Driver ID (16 digits): ");
            driverId = scanner.nextLine();
            if (driverId.matches("\\d{16}")) {
                break;
            } else {
                System.out.println("Invalid National ID. It must be exactly 16 digits.");
            }
        }

        
        String driverName;
        while (true) {
            System.out.print("Enter Driver Name: ");
            driverName = scanner.nextLine();
            if (driverName.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please use letters only.");
            }
        }

        
        String plate;
        while (true) {
            System.out.print("Enter Vehicle Plate (e.g. RAB123D): ");
            plate = scanner.nextLine();
            if (plate.matches("[A-Z]{3}\\d{3}[A-Z]")) {
                break;
            } else {
                System.out.println("Invalid plate format. Format should be like RAB123D.");
            }
        }

        
        String type;
        while (true) {
            System.out.print("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
            type = scanner.nextLine().toUpperCase();
            if (type.equals("SPEEDING") || type.equals("RED_LIGHT") || type.equals("NO_HELMET") || type.equals("DUI")) {
                break;
            } else {
                System.out.println("Invalid type. Choose one of: SPEEDING, RED_LIGHT, NO_HELMET, DUI.");
            }
        }

        
        System.out.println("Choose Service: 1. Record Violation  2. Assess Fine  3. Pay Fine");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                ViolationEntry entry = new ViolationEntry(driverId, driverName, plate, type);
                entry.recordViolation();
                break;
            case 2:
                FineAssessment assessment = new FineAssessment(driverId, driverName, plate, type);
                assessment.assessFine();
                break;
            case 3:
                System.out.print("Enter Fine Amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                
                String status;
                while (true) {
                    System.out.print("Enter Payment Status (PAID/UNPAID): ");
                    status = scanner.nextLine().toUpperCase();
                    if (status.equals("PAID") || status.equals("UNPAID")) {
                        break;
                    } else {
                        System.out.println("Invalid status. Enter either PAID or UNPAID.");
                    }
                }

                FinePayment payment = new FinePayment(driverId, driverName, plate, type, amount, status);
                payment.processPayment();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
