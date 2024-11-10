package CreationalDesignPatterns.BuilderPattern.solution;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new BedroomBuilder().setDimension(new Dimension(200, 100))
                                              .setCeilingHeight(132)
                                              .setFloornumber(2)
                                              .setWallColor(Color.BLACK)
                                              .setNumberOfWindows(2)
                                              .setNumberOfDoors(1)
                                              .setDouble(true)
                                              .setHasEnsuite(true)
                                              .createBedroom();
        System.out.println(bedroom);

    }
}
