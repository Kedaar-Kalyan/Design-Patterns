package StructuralDesignPatterns.BridgePattern.example2;

public class Canvas {
    public static void main(String[] args) {
        CheckBoxButton checkBoxButton = new CheckBoxButton(new SmallSize());
        checkBoxButton.draw();
        RadioButton radioButton = new RadioButton(new MediumSize());
        radioButton.draw();
        DropdownButton dropdownButton = new DropdownButton(new LargeSize());
        dropdownButton.draw();
    }
}
