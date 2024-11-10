package CreationalDesignPatterns.FactoryPattern;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Riding a Bike");
    }
}