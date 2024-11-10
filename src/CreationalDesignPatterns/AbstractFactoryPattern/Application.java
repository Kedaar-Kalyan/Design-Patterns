package CreationalDesignPatterns.AbstractFactoryPattern;

import CreationalDesignPatterns.AbstractFactoryPattern.button.Button;
import CreationalDesignPatterns.AbstractFactoryPattern.checkbox.CheckBox;
import CreationalDesignPatterns.AbstractFactoryPattern.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
