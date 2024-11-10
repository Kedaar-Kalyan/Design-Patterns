package CreationalDesignPatterns.AbstractFactoryPattern.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Created Windows Button!!!");
    }
}
