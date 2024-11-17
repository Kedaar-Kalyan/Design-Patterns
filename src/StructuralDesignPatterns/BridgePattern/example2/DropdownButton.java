package StructuralDesignPatterns.BridgePattern.example2;

public class DropdownButton implements Button {
    Size size;

    public DropdownButton(Size size) {
        this.size = size;
    }

    @Override
    public void draw() {
        size.setSize();
        System.out.println("Drawing a Dropdown Button");
    }
}
