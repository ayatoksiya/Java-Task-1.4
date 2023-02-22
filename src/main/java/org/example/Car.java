package org.example;

import java.util.ArrayList;
import java.util.List;


public class Car {

    private boolean AutomaticGear;
    private SegmentType segment;
    private List<Dimension> dimensions = new ArrayList<>();
    private Producent producent;
    private Market market;

    public Car(Producent producent, boolean AutomaticGear, Market market, SegmentType segment, Dimension dimension) {
        this.producent = producent;
        this.AutomaticGear = AutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions.add(dimension);
    }

    public static void getCarSpecification(ArrayList<Car> cars) {

        for (Car car : cars) {
            if (car.producent.toString().contains("BMW") && car.AutomaticGear && (car.dimensions.get(0).getTrunkCapacity() > 300)) {
                System.out.println(car.producent + " " + car.market.getCountries() + " " + car.dimensions.get(0).getTrunkCapacity());
            }
        }
    }
}


