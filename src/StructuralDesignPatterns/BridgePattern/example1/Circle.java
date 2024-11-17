package StructuralDesignPatterns.BridgePattern.example1;

import java.awt.*;

public class Circle implements Shape{
    ColorShape colorShape;

    public Circle(ColorShape colorShape){
        this.colorShape = colorShape;
    }
    @Override
    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);
        graphics.fillOval(75,15,50,50);
    }
}
