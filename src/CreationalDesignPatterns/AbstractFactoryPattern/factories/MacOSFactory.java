package CreationalDesignPatterns.AbstractFactoryPattern.factories;

import CreationalDesignPatterns.AbstractFactoryPattern.button.Button;
import CreationalDesignPatterns.AbstractFactoryPattern.button.MacOSButton;
import CreationalDesignPatterns.AbstractFactoryPattern.checkbox.CheckBox;
import CreationalDesignPatterns.AbstractFactoryPattern.checkbox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }
}
