
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RentalManager manager = new RentalManager();

        int choice = 0;

        do {
            try {
                System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");
                System.out.println("1. View All Vehicles");
                System.out.println("2. Rent a Vehicle");
                System.out.println("3. Return a Vehicle");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        manager.displayVehicles();
                        break;

                    case 2:
                        manager.displayVehicles();

                        System.out.print("Enter Vehicle ID: ");
                        int vehicleId = sc.nextInt();

                        System.out.print("Enter rental days: ");
                        int days = sc.nextInt();

                        manager.rentVehicle(vehicleId, days);
                        break;

                    case 3:
                        manager.displayVehicles();

                        System.out.print("Enter Vehicle ID to return: ");
                        int returnId = sc.nextInt();

                        manager.returnVehicle(returnId);
                        break;

                    case 4:
                        System.out.println("Thank you for using our system!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 4);

        sc.close();
    }
}
