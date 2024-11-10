package CreationalDesignPatterns.AbstractFactoryPattern.factories;

import CreationalDesignPatterns.AbstractFactoryPattern.button.Button;
import CreationalDesignPatterns.AbstractFactoryPattern.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
