abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    @Override
    public String toString() {
        return "Car [numberOfDoors=" + numberOfDoors + ", " + super.toString() + "]";
    }
}

class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(String brand, String model, int year, boolean hasBell) {
        super(brand, model, year);
        this.hasBell = hasBell;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public void drive() {
        System.out.println("Riding a bicycle");
    }

    @Override
    public String toString() {
        return "Bicycle [hasBell=" + hasBell + ", " + super.toString() + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4);
        Bicycle bicycle = new Bicycle("Giant", "Escape 3", 2021, true);

        car.drive(); // Output: Driving a car
        bicycle.drive(); // Output: Riding a bicycle

        System.out.println(car); // Output: Car [numberOfDoors=4, Vehicle [brand=Toyota, model=Camry, year=2020]]
        System.out.println(bicycle); // Output: Bicycle [hasBell=true, Vehicle [brand=Giant, model=Escape 3, year=2021]]
    }
}
