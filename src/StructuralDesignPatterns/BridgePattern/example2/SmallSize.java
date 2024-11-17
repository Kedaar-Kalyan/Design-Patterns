package StructuralDesignPatterns.BridgePattern.example2;

public class SmallSize implements Size {
    @Override
    public void setSize() {
        System.out.println("Seting the size to small!!!");
    }
}
