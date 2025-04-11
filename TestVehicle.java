import java.util.Scanner;
class Vehicle {

    private String brand;
    private double speed;
    private String fuelType;

    public Vehicle (String brand, double speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return this.brand;
    }

    public double speed() {
        return this.speed;
    }

    public String fuelType() {
        return this.fuelType;
    }

    public void displayInfo() { 
        System.out.println("Brand: " + brand); 
        System.out.println("Speed: " + speed + " km/h"); 
        System.out.println("Fuel Type: " + fuelType); 
    }
}
class Car extends Vehicle {

    private int numDoors;

    public Car (String brand, double speed, String fuelType, int numDoors) {          
        super (brand, speed, fuelType);
        this.numDoors = numDoors;
    }
    
    @Override

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors" + numDoors);
    }
}

class Motorcycle extends Vehicle {

    private boolean hasSideCar;

    public Motorcycle (String brand, double speed, String fuelType, boolean hasSideCar) {
       super (brand, speed, fuelType);
       this.hasSideCar = hasSideCar;
    }

    @Override

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Car Details! ");
        System.out.println("Brand: ");
        String carBrand = scanner.nextLine();

        System.out.println("Speed: ");
        double carSpeed = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Fuel Type: ");
        String carFuelType = scanner.nextLine();

        System.out.print("Number of Doors: "); 
        int numDoors = scanner.nextInt(); 
        scanner.nextLine();

        System.out.println("\nEnter Motorcycle Details! "); 
        System.out.print("Brand: "); 
        String motoBrand = scanner.nextLine(); 

        System.out.print("Speed: "); 
        int motoSpeed = scanner.nextInt(); 

        scanner.nextLine();
        System.out.print("Fuel Type: "); 
        String motoFuel = scanner.nextLine(); 
        
        System.out.print("Has Sidecar? (true/false): "); 
        boolean hasSideCar = scanner.nextBoolean(); 

        Vehicle car = new Car(carBrand, carSpeed, carFuelType, numDoors); 
        Vehicle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSideCar); 
 
        System.out.println("\nCar Details:"); 
        car.displayInfo(); 
        System.out.println(); 
        System.out.println("Motorcycle Details:"); 
        motorcycle.displayInfo(); 
 
        scanner.close(); 
    } 
} 






