package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        Properties countryObj = FileHandler.getCountryName();
        Country country1 = new Country(countryObj.getProperty("country1"), countryObj.getProperty("countrySign1").charAt(0));
        Country country2 = new Country(countryObj.getProperty("country2"), countryObj.getProperty("countrySign2").charAt(0));
        Country country3 = new Country(countryObj.getProperty("country3"), countryObj.getProperty("countrySign3").charAt(0));
        Country country4 = new Country(countryObj.getProperty("country4"), countryObj.getProperty("countrySign4").charAt(0));
        Country country5 = new Country(countryObj.getProperty("country5"), countryObj.getProperty("countrySign5").charAt(0));


        Properties marketObj = FileHandler.getMarketTypes();
        Market market1 = new Market(marketObj.getProperty("market1"), new ArrayList<Country>() {
            {
                add(0, country2);
                add(1, country3);
                add(2, country4);
            }
        });
        Market market2 = new Market(marketObj.getProperty("market2"), new ArrayList<Country>() {
            {
                add(0, country1);
                add(1, country2);
                add(2, country3);
            }
        });
        Market market3 = new Market(marketObj.getProperty("market3"), new ArrayList<Country>() {
            {
                add(0, country3);
                add(1, country4);
                add(2, country5);
            }
        });
        Market market4 = new Market(marketObj.getProperty("market4"), new ArrayList<Country>() {
            {
                add(0, country1);
                add(1, country4);
                add(2, country5);
            }
        });
        Market market5 = new Market(marketObj.getProperty("market5"), new ArrayList<Country>() {
            {
                add(0, country2);
                add(1, country3);
                add(2, country5);
            }
        });

        Properties brandObj = FileHandler.getBrandTypes();
        Properties modelObj = FileHandler.getModelTypes();
        Producent producent1 = new Producent(brandObj.getProperty("brand1"), modelObj.getProperty("model5"));
        Producent producent2 = new Producent(brandObj.getProperty("brand1"), modelObj.getProperty("model6"));
        Producent producent3 = new Producent(brandObj.getProperty("brand1"), modelObj.getProperty("model7"));
        Producent producent4 = new Producent(brandObj.getProperty("brand2"), modelObj.getProperty("model8"));
        Producent producent5 = new Producent(brandObj.getProperty("brand2"), modelObj.getProperty("model9"));
        Producent producent6 = new Producent(brandObj.getProperty("brand2"), modelObj.getProperty("model10"));
        Producent producent7 = new Producent(brandObj.getProperty("brand3"), modelObj.getProperty("model1"));
        Producent producent8 = new Producent(brandObj.getProperty("brand3"), modelObj.getProperty("model2"));
        Producent producent9 = new Producent(brandObj.getProperty("brand3"), modelObj.getProperty("model3"));
        Producent producent10 = new Producent(brandObj.getProperty("brand3"), modelObj.getProperty("model4"));

        Properties heightObj = FileHandler.getHeightTypes();
        Properties widthObj = FileHandler.getWidthTypes();
        Properties capacityObj = FileHandler.getCapacityTypes();
        Dimension dimension1 = new Dimension(heightObj.getProperty("height1"), widthObj.getProperty("width1"), capacityObj.getProperty("capacity1"));
        Dimension dimension2 = new Dimension(heightObj.getProperty("height1"), widthObj.getProperty("width1"), capacityObj.getProperty("capacity2"));
        Dimension dimension3 = new Dimension(heightObj.getProperty("height4"), widthObj.getProperty("width4"), capacityObj.getProperty("capacity6"));
        Dimension dimension4 = new Dimension(heightObj.getProperty("height3"), widthObj.getProperty("width3"), capacityObj.getProperty("capacity5"));
        Dimension dimension5 = new Dimension(heightObj.getProperty("height2"), widthObj.getProperty("width2"), capacityObj.getProperty("capacity4"));
        Dimension dimension6 = new Dimension(heightObj.getProperty("height2"), widthObj.getProperty("width3"), capacityObj.getProperty("capacity3"));
        Dimension dimension7 = new Dimension(heightObj.getProperty("height4"), widthObj.getProperty("width3"), capacityObj.getProperty("capacity5"));
        Dimension dimension8 = new Dimension(heightObj.getProperty("height1"), widthObj.getProperty("width2"), capacityObj.getProperty("capacity1"));
        Dimension dimension9 = new Dimension(heightObj.getProperty("height4"), widthObj.getProperty("width2"), capacityObj.getProperty("capacity3"));
        Dimension dimension10 = new Dimension(heightObj.getProperty("height3"), widthObj.getProperty("width4"), capacityObj.getProperty("capacity6"));

        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car(producent1, true, market1, SegmentType.STANDARD, dimension1);
        cars.add(car1);
        Car car2 = new Car(producent2, false, market2, SegmentType.MEDIUM, dimension2);
        cars.add(car2);
        Car car3 = new Car(producent3, true, market3, SegmentType.PREMIUM, dimension3);
        cars.add(car3);
        Car car4 = new Car(producent4, false, market4, SegmentType.STANDARD, dimension4);
        cars.add(car4);
        Car car5 = new Car(producent5, true, market5, SegmentType.PREMIUM, dimension5);
        cars.add(car5);
        Car car6 = new Car(producent6, false, market1, SegmentType.MEDIUM, dimension6);
        cars.add(car6);
        Car car7 = new Car(producent7, true, market2, SegmentType.STANDARD, dimension7);
        cars.add(car7);
        Car car8 = new Car(producent8, false, market3, SegmentType.MEDIUM, dimension8);
        cars.add(car8);
        Car car9 = new Car(producent9, true, market4, SegmentType.PREMIUM, dimension9);
        cars.add(car9);
        Car car10 = new Car(producent10, true, market5, SegmentType.STANDARD, dimension10);
        cars.add(car10);
        Car car11 = new Car(producent1, false, market1, SegmentType.MEDIUM, dimension1);
        cars.add(car11);
        Car car12 = new Car(producent2, true, market2, SegmentType.PREMIUM, dimension2);
        cars.add(car12);
        Car car13 = new Car(producent3, false, market3, SegmentType.STANDARD, dimension3);
        cars.add(car13);
        Car car14 = new Car(producent4, true, market4, SegmentType.MEDIUM, dimension4);
        cars.add(car14);
        Car car15 = new Car(producent5, false, market5, SegmentType.PREMIUM, dimension5);
        cars.add(car15);

        Car.getCarSpecification(cars);
    }
}