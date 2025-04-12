import java.util.Scanner;

public class TestVehicle {
    private String brand;
    private int speed;
    private String FuelType;

    public TestVehicle(String brand, int speed, String FuelType) {
        this.brand = brand;
        this.speed = speed;
        this.FuelType = FuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void displayinfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + FuelType);
    }

    class Car extends TestVehicle {
        private int numDoors;

        public Car(String brand, int speed, String FuelType, int numDoors) {
            super(brand, speed, FuelType);
            this.numDoors = numDoors;
        }

        public int getNumDoors() {
            return numDoors;
        }

        @Override
        public void displayinfo() {
            super.displayinfo();
            System.out.println("Number of Doors: " + numDoors);
        }
    }

    class Motorcycle extends TestVehicle {
        private String hasSidecar;

        public Motorcycle(String brand, int speed, String FuelType, String sideCar) {
            super(brand, speed, FuelType);
            this.hasSidecar = sideCar;
        }

        public String getSideCar() {
            return hasSidecar;
        }

        @Override
        public void displayinfo() {
            super.displayinfo();
            System.out.println("Does it have a sidecar? " + hasSidecar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = ""; // Initialize inp to an empty string

        do {
            System.out.println("Enter C for car or M for Motorcycle:");
            String vehicleType = sc.nextLine();

            if (vehicleType.equalsIgnoreCase("C")) {
                System.out.println("Enter the brand of the car:");
                String brand = sc.nextLine();

                System.out.println("Enter the speed of the car:");
                int speed = sc.nextInt();
                sc.nextLine(); // Consume newline

                System.out.println("Enter the fuel type of the car:");
                String fuelType = sc.nextLine();

                System.out.println("Enter the number of doors in the car:");
                int numDoors = sc.nextInt();
                sc.nextLine(); // Consume newline

                TestVehicle outer = new TestVehicle(brand, speed, fuelType);
                Car car = outer.new Car(brand, speed, fuelType, numDoors);
                car.displayinfo();

            } else if (vehicleType.equalsIgnoreCase("M")) {
                System.out.println("Enter the brand of the motorcycle:");
                String brand = sc.nextLine();

                System.out.println("Enter the speed of the motorcycle:");
                int speed = sc.nextInt();
                sc.nextLine(); // Consume newline

                System.out.println("Enter the fuel type of the motorcycle:");
                String fuelType = sc.nextLine();

                System.out.println("Does it have a sidecar? yes/no:");
                String hasSidecar = sc.nextLine();

                TestVehicle outer = new TestVehicle(brand, speed, fuelType);
                Motorcycle motorcycle = outer.new Motorcycle(brand, speed, fuelType, hasSidecar);
                motorcycle.displayinfo();

            } else {
                System.out.println("Invalid vehicle type entered.");
            }

            System.out.println("Do you want to continue? (yes/no):");
            inp = sc.nextLine(); // Update inp with user input
        } while (!inp.equalsIgnoreCase("no"));

        System.out.println("Exiting the program.");
        sc.close();
    }
}