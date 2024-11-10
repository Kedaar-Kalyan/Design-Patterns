package CreationalDesignPatterns.AbstractFactoryPattern.checkbox;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Created WindowsCheckbox.");
    }
}
