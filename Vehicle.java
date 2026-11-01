 
public abstract class Vehicle {

    // Private data members
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean available = true;

    // Constructor
    public Vehicle(String brand, String model, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    // Availability methods
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Setter with validation
    public void setPricePerDay(double pricePerDay) {
        if (pricePerDay > 0) {
            this.pricePerDay = pricePerDay;
        } else {
            System.out.println("Invalid rental price!");
        }
    }

    // Display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price per day: Rs. " + pricePerDay);
        System.out.println("Availability: "
                + (available ? "Available" : "Rented"));
    }

    // Abstract method
    public abstract double calculateRent(int days);
}
