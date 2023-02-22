package org.example;

import java.util.ArrayList;
import java.util.List;


public class Market {

    private String name;
    private List<Country> countries;

    public Market(String name, ArrayList<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    @Override
    public String toString() {
        return this.name + " " + this.countries.toString();
    }

    public String getCountries() {
        return this.countries.toString();
    }
}


