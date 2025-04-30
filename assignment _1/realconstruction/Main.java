


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String id;
        while (true) {
            System.out.println("Enter constructor ID:");
            id = scanner.nextLine();
            if (id.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid ID. Only numbers are allowed.");
            }
        }

       
        String name;
        while (true) {
            System.out.println("Enter constructor name:");
            name = scanner.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid name. Only letters and spaces are allowed.");
            }
        }

        
        double quantity;
        while (true) {
            System.out.println("Enter material quantity:");
            if (scanner.hasNextDouble()) {
                quantity = scanner.nextDouble();
                if (quantity > 0) {
                    break;
                } else {
                    System.out.println("Quantity must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Enter a number.");
                scanner.next(); 
            }
        }

        double initialBalance = 10;

        
        int choice;
        while (true) {
            System.out.println("Choose operation: 1. Deliver material  2. Use material  3. Estimate cost");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Choose 1, 2, or 3.");
                }
            } else {
                System.out.println("Invalid input. Enter a number.");
                scanner.next(); 
            }
        }

        
        switch (choice) {
            case 1:
                MaterialDelivery delivery = new MaterialDelivery(id, name, quantity, initialBalance);
                delivery.receiveMaterial();
                break;

            case 2:
                MaterialUsage usage = new MaterialUsage(id, name, initialBalance, quantity);
                usage.useMaterial();
                break;

            case 3:
                CostEstimation cost = new CostEstimation(id, name, initialBalance, quantity);
                cost.estimateCost();
                break;
        }

        scanner.close();
    }
}
