package CreationalDesignPatterns.FactoryPattern;

public class CycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Cycle();
    }
}
