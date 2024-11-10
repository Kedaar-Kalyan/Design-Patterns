package CreationalDesignPatterns.AbstractFactoryPattern.checkbox;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Created MacOSCheckbox.");
    }
}
