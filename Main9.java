// Base class
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    // Constructor
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0.0; // Default
    }

    public double calculateDistanceTraveled(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }

    public int getMaxSpeed() {
        return 0; // Default
    }
}

// Truck subclass
class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 6.5; // mpg or km/l
    }

    @Override
    public int getMaxSpeed() {
        return 120;
    }
}

// Car subclass
class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0;
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 40.0;
    }

    @Override
    public int getMaxSpeed() {
        return 160;
    }
}
