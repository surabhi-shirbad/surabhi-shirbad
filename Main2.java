
class Vehicle {
    
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();

        System.out.println("Vehicle action:");
        myVehicle.drive(); 

        System.out.println("Car action:");
        myCar.drive();     
}
}