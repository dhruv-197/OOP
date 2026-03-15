class Vehicle {

    protected int vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(int vNo, String b, String f) {
        vehicleNumber = vNo;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Car extends Vehicle {

    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(int vNo, String b, String f, int seats, boolean ac) {
        super(vNo, b, f);
        numberOfSeats = seats;
        ACavailable = ac;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}


class ElectricCar extends Car {

    double batteryCapacity;
    double chargingTime;

    ElectricCar(int vNo, String b, String f,
                int seats, boolean ac,
                double battery, double charge) {

        super(vNo, b, f, seats, ac);

        batteryCapacity = battery;
        chargingTime = charge;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}


public class Practical25 {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(101, "Tata", "Petrol");
        v1.displayDetails();

        System.out.println();

        Car c1 = new Car(102, "Hyundai", "Diesel", 5, true);
        c1.displayDetails();

        System.out.println();

        ElectricCar e1 = new ElectricCar(103, "Tesla", "Electric",
                5, true, 75, 2.5);
        e1.displayDetails();

        System.out.println();

        Vehicle v = new Car(104, "Honda", "Petrol", 4, true);
        v.displayDetails();

        if (v instanceof Car) {
            Car c = (Car) v;
            System.out.println("Downcasting successful");
            c.displayDetails();
        }
    }
}