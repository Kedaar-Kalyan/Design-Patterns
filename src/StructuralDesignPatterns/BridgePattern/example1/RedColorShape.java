package StructuralDesignPatterns.BridgePattern.example1;

import java.awt.*;

public class RedColorShape implements ColorShape{
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.RED);
    }
}
