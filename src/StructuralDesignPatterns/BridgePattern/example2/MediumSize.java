package StructuralDesignPatterns.BridgePattern.example2;

public class MediumSize implements Size {
    @Override
    public void setSize() {
        System.out.println("Seting the size to medium!!!");
    }
}
