package org.example;

public class Dimension {
    private int high;
    private int width;
    private int trunkCapacity;

    public Dimension(String high, String width, String trunkCapacity) {
        this.high = Integer.parseInt(high);
        this.width = Integer.parseInt(width);
        this.trunkCapacity = Integer.parseInt(trunkCapacity);
    }

    @Override
    public String toString() {
        return this.high + "cm, " + this.width + "cm, " + this.trunkCapacity + "liters";
    }

    public int getTrunkCapacity() {
        return this.trunkCapacity;
    }

}
