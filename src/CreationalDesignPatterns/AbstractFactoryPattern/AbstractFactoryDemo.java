package CreationalDesignPatterns.AbstractFactoryPattern;

import CreationalDesignPatterns.AbstractFactoryPattern.factories.GUIFactory;
import CreationalDesignPatterns.AbstractFactoryPattern.factories.MacOSFactory;
import CreationalDesignPatterns.AbstractFactoryPattern.factories.WindowsFactory;

public class AbstractFactoryDemo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

