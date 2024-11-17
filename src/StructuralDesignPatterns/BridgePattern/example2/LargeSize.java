package StructuralDesignPatterns.BridgePattern.example2;

public class LargeSize implements Size {
    @Override
    public void setSize() {
        System.out.println("Seting the size to large!!!");
    }
}
