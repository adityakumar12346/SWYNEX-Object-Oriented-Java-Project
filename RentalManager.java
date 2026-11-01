
import java.util.ArrayList;

public class RentalManager {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Constructor: Add vehicles to the system
    public RentalManager() {

        vehicles.add(new Car("Toyota", "Innova", 2000, 7));
        vehicles.add(new Car("Hyundai", "Creta", 1800, 5));

        vehicles.add(new Bike("Royal Enfield", "Classic 350", 500, 350));
        vehicles.add(new Bike("Honda", "Activa", 300, 110));
    }

    // Display all vehicles
    public void displayVehicles() {

        System.out.println("\n===== VEHICLE LIST =====");

        for (int i = 0; i < vehicles.size(); i++) {

            Vehicle vehicle = vehicles.get(i);

            System.out.println("\nVehicle ID: " + (i + 1));
            vehicle.displayDetails();

            if (vehicle.isAvailable()) {
                System.out.println("Status: Available");
            } else {
                System.out.println("Status: Rented");
            }
        }
    }

    // Rent a vehicle
    public void rentVehicle(int vehicleId, int days) {

        if (vehicleId < 1 || vehicleId > vehicles.size()) {
            System.out.println("Invalid vehicle ID!");
            return;
        }

        Vehicle vehicle = vehicles.get(vehicleId - 1);

        if (!vehicle.isAvailable()) {
            System.out.println("Sorry! This vehicle is already rented.");
            return;
        }

        if (days <= 0) {
            System.out.println("Number of days must be greater than zero.");
            return;
        }

        double totalRent = vehicle.calculateRent(days);

        vehicle.setAvailable(false);

        System.out.println("\n===== RENTAL SUCCESSFUL =====");
        vehicle.displayDetails();
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rent: Rs. " + totalRent);
    }

    // Return a vehicle
    public void returnVehicle(int vehicleId) {

        if (vehicleId < 1 || vehicleId > vehicles.size()) {
            System.out.println("Invalid vehicle ID!");
            return;
        }

        Vehicle vehicle = vehicles.get(vehicleId - 1);

        if (vehicle.isAvailable()) {
            System.out.println("This vehicle was not rented!");
            return;
        }

        vehicle.setAvailable(true);

        System.out.println("\n===== VEHICLE RETURNED SUCCESSFULLY =====");
        vehicle.displayDetails();
        System.out.println("Vehicle is now available for rent.");
    }
}
