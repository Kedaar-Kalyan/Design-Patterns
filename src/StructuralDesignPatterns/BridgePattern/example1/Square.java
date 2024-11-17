package StructuralDesignPatterns.BridgePattern.example1;

import java.awt.*;

public class Square implements Shape {
    ColorShape colorShape;

    public Square(ColorShape colorShape){
        this.colorShape = colorShape;
    }
    @Override
    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);
        graphics.fillRect(5,15,50,50);
    }
}
