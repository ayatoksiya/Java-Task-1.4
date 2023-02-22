package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileHandler {

    public static Properties getCountryName() throws IOException {
        String countryTypesProperties = "countryNames.properties";
        return getProperties(countryTypesProperties);
    }

    public static Properties getMarketTypes() throws IOException {
        String marketTypesProperties = "marketTypes.properties";
        return getProperties(marketTypesProperties);
    }

    public static Properties getBrandTypes() throws IOException {
        String brandTypesProperties = "brandTypes.properties";
        return getProperties(brandTypesProperties);
    }

    public static Properties getModelTypes() throws IOException {
        String modelTypesProperties = "modelTypes.properties";
        return getProperties(modelTypesProperties);
    }

    public static Properties getHeightTypes() throws IOException {
        String heightTypesProperties = "heightTypes.properties";
        return getProperties(heightTypesProperties);
    }

    public static Properties getWidthTypes() throws IOException {
        String widthTypesProperties = "widthTypes.properties";
        return getProperties(widthTypesProperties);
    }

    public static Properties getCapacityTypes() throws IOException {
        String capacityTypesProperties = "capacityTypes.properties";
        return getProperties(capacityTypesProperties);
    }

    public static Properties getProperties(String prop) throws IOException {
        InputStream configFile = null;
        Properties properties = null;

        try {
            configFile = ClassLoader.getSystemClassLoader().getResourceAsStream(prop);
            properties = new Properties();
            properties.load(configFile);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert configFile != null;
            configFile.close();
        }
        return properties;
    }
}
