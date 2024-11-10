package CreationalDesignPatterns.AbstractFactoryPattern.factories;

import CreationalDesignPatterns.AbstractFactoryPattern.button.Button;
import CreationalDesignPatterns.AbstractFactoryPattern.button.WindowsButton;
import CreationalDesignPatterns.AbstractFactoryPattern.checkbox.CheckBox;
import CreationalDesignPatterns.AbstractFactoryPattern.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
