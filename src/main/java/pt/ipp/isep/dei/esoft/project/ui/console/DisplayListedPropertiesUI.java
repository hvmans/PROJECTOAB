package pt.ipp.isep.dei.esoft.project.ui.console;

import pt.ipp.isep.dei.esoft.project.application.controller.DisplayListedPropertiesController;
import pt.ipp.isep.dei.esoft.project.domain.*;

import java.util.List;

public class DisplayListedPropertiesUI implements Runnable {

    DisplayListedPropertiesController displayListedPropertiesController = new DisplayListedPropertiesController();
    @Override
    public void run() {
        displayListedProperties();
    }

    public void displayListedProperties() {
        List<Property> properties = displayListedPropertiesController.getPropertiesToDisplay();
        for (Property property: properties) {
            int propertyCount = 0;
            if (property.getPropertyType().equalsIgnoreCase("Apartment")) {
                Apartment apartment = (Apartment) property;
                propertyCount++;
                System.out.printf("*** Property %d ***\n ", propertyCount);
                System.out.printf("This property is an %s\n", property.getPropertyType());
                System.out.printf("Owner: %s\n Location: %s\n Area: %.1f\n Distance from city center: %.1f\n Photos: %s\n Number of bedrooms: %d\n Number of bathrooms: %d\n Number of parking spaces: %d\n Available equipment: %s\n",
                        apartment.getOwner(), apartment.getLocation(), apartment.getArea(), apartment.getDistanceCenter(), apartment.getPhotos(), apartment.getNumberBedrooms(), apartment.getNumberBathrooms(), apartment.getNumberParkingSpaces(), apartment.getAvailableEquipment());
                System.out.println();
            } else if (property.getPropertyType().equalsIgnoreCase("House")) {
                House house = (House) property;
                propertyCount++;
                System.out.printf("*** Property %d ***\n ", propertyCount);
                System.out.printf("This property is an %s\n", property.getPropertyType());
                System.out.printf("Owner: %s\n Location: %s\n Area: %.1f\n Distance from city center: %.1f\n Photos: %s\n Number of bedrooms: %d\n Number of bathrooms: %d\n Number of parking spaces: %d\n Available equipment: %s\n Basement: %b\n Inhabitable loft: %b\n Sun exposure: %s\n",
                        house.getOwner(), house.getLocation(), house.getArea(), house.getDistanceCenter(), house.getPhotos(), house.getNumberBedrooms(), house.getNumberBathrooms(), house.getNumberParkingSpaces(), house.getAvailableEquipment(), house.isExistBasement(), house.isExistInhabitableLoft(), house.getSunExposure());
                System.out.println();
            } else {
                Land land = (Land) property;
                propertyCount++;
                System.out.printf("*** Property %d ***\n ", propertyCount);
                System.out.printf("This property is an %s\n", property.getPropertyType());
                System.out.printf("Owner: %s\n Location: %s\n Area: %.1f\n Distance from city center: %.1f\n Photos: %s\n",
                        land.getOwner(), land.getLocation(), land.getArea(), land.getDistanceCenter(), land.getPhotos());
                System.out.println();
            }
        }
    }

}
