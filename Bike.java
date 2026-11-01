   
public class Bike extends Vehicle {

    private int engineCapacity;

    // Constructor
    public Bike(String brand, String model,
                double pricePerDay, int engineCapacity) {

        super(brand, model, pricePerDay);

        this.engineCapacity = engineCapacity;
    }

    // Implementing abstract method from Vehicle
   @Override
public double calculateRent(int days) {
    double total = getPricePerDay() * days;
    return total + 100; // Additional bike service charge
}

    // Display bike details
    public void displayBikeDetails() {

        displayDetails();

        System.out.println("Engine Capacity: "
                           + engineCapacity + " cc");
    }
}

