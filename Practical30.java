abstract class Vehicle
{
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle
{
    String fuelType()
    {
        return "Petrol/Diesel";
    }

    int noOfWheels()
    {
        return 4;
    }
}

class Bike extends Vehicle
{
    String fuelType()
    {
        return "Petrol";
    }

    int noOfWheels()
    {
        return 2;
    }
}

public class Practical30
{
    public static void main(String[] args)
    {
        System.out.println("Dhruv Soni - 240390107005");
        Car c = new Car();
        Bike b = new Bike();

        System.out.println("Car Fuel: " + c.fuelType());
        System.out.println("Car Wheels: " + c.noOfWheels());

        System.out.println("Bike Fuel: " + b.fuelType());
        System.out.println("Bike Wheels: " + b.noOfWheels());
    }
}
