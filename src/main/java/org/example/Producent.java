package org.example;

public class Producent {

    private String model;
    private String type;

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.model + " " + this.type;
    }

}
