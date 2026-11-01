
public class Car extends Vehicle {

    private int numberOfSeats;

    // Constructor
    public Car(String brand, String model,
               double pricePerDay, int numberOfSeats) {

        super(brand, model, pricePerDay);

        this.numberOfSeats = numberOfSeats;
    }

    @Override
public double calculateRent(int days) {
    double total = getPricePerDay() * days;
    return total + 500; // Additional car service charge
}

    // Display car details
    public void displayCarDetails() {

        displayDetails();

        System.out.println("Seats: " + numberOfSeats);
    }
}
