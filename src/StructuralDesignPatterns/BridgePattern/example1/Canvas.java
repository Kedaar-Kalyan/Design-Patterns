package StructuralDesignPatterns.BridgePattern.example1;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    public void paint(Graphics graphics){
        Square square = new Square(new BlueColorShape());
        square.draw(graphics);
        Circle circle = new Circle(new RedColorShape());
        circle.draw(graphics);
        Triangle triangle = new Triangle(new GreenColorShape());
        triangle.draw(graphics);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
