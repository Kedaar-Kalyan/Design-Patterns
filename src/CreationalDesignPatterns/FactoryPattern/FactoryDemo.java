package CreationalDesignPatterns.FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        // Create a Car using CarFactory
        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle1 = vehicleFactory.createVehicle();
        vehicle1.drive();  // Output: Driving a Car

        // Create a Bike using BikeFactory
        vehicleFactory = new BikeFactory();
        Vehicle vehicle2 = vehicleFactory.createVehicle();
        vehicle2.drive();  // Output: Riding a Bike

        // Create a Truck using TruckFactory
        vehicleFactory = new CycleFactory();
        Vehicle vehicle3 = vehicleFactory.createVehicle();
        vehicle3.drive();  // Output: Riding a Cycle
    }
}
