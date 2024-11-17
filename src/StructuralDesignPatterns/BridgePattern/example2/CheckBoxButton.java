package StructuralDesignPatterns.BridgePattern.example2;

public class CheckBoxButton implements Button {
    Size size;

    public CheckBoxButton(Size size) {
        this.size = size;
    }

    @Override
    public void draw() {
        size.setSize();
        System.out.println("Drawing a CheckBox Button");
    }
}
