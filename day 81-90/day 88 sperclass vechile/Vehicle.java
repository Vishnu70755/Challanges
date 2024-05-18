import java.util.Scanner;

public class Vehicle {
    private double speed;
    private double fuelConsumption; // fuel consumption in liters per 100 km
    private String make;
    private String model;
    private int year;
    private double fuelCapacity; // fuel capacity in liters

    // Default constructor
    public Vehicle() {
    }

    // Constructor with all attributes
    public Vehicle(double speed, double fuelConsumption, String make, String model, int year, double fuelCapacity) {
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
    }

    // Getters
    public double getSpeed() {
        return speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    // Setters
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    // Method to calculate the fuel needed for a given distance
    public double calculateFuelNeeded(double distance) {
        return (fuelConsumption / 100) * distance;
    }

    // toString method to display vehicle details
    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                " km/h, fuelConsumption=" + fuelConsumption +
                " liters/100km, make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelCapacity=" + fuelCapacity +
                " liters}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();

        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();

        System.out.println("Enter vehicle year: ");
        int year = scanner.nextInt();

        System.out.println("Enter vehicle speed (km/h): ");
        double speed = scanner.nextDouble();

        System.out.println("Enter vehicle fuel consumption (liters per 100 km): ");
        double fuelConsumption = scanner.nextDouble();

        System.out.println("Enter vehicle fuel capacity (liters): ");
        double fuelCapacity = scanner.nextDouble();

        Vehicle vehicle = new Vehicle(speed, fuelConsumption, make, model, year, fuelCapacity);

        System.out.println(vehicle);

        System.out.println("Enter distance to travel (km): ");
        double distance = scanner.nextDouble();
        System.out.println("Fuel needed for " + distance + " km: " + vehicle.calculateFuelNeeded(distance) + " liters");
    }
}
