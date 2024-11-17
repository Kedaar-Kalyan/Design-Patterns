package StructuralDesignPatterns.BridgePattern.example1;

import java.awt.*;

public class Triangle implements Shape {
    ColorShape colorShape;

    public Triangle(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics graphics) {
        int[] x = { 200, 250, 150 };
        int[] y = { 15, 65, 65 };
        int n = 3;
        colorShape.setColor(graphics);
        graphics.fillPolygon(x, y, n);
    }
}
