package CreationalDesignPatterns.BuilderPattern.solution;

import java.awt.*;

public class Bedroom {
    private Dimension dimension;
    private int ceilingHeight;
    private int floornumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Bedroom(Dimension dimension, int ceilingHeight, int floornumber, Color wallColor, int numberOfWindows,
            int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floornumber = floornumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }
}
