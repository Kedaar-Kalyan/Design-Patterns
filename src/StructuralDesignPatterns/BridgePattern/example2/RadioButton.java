package StructuralDesignPatterns.BridgePattern.example2;

public class RadioButton implements Button {
    Size size;

    public RadioButton(Size size) {
        this.size = size;
    }

    @Override
    public void draw() {
        size.setSize();
        System.out.println("Drawing a Radio Button");
    }
}
