package CreationalDesignPatterns.FactoryPattern;

public class Cycle implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Riding a Cycle");
    }
}
