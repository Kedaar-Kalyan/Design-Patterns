package CreationalDesignPatterns.BuilderPattern.problem;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(new Dimension(200, 100), 132, 2, Color.BLACK, 2, 1, true, true);
        System.out.println(bedroom);

        // we should be able to create Bedroom with any combination of the parameters.
        // Option - 1 By implementing the constructors for all the combination of parameters
        // Option - 2 By implementing the Builder Pattern
    }
}
