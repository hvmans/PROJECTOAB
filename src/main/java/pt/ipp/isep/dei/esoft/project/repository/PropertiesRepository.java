package pt.ipp.isep.dei.esoft.project.repository;

import pt.ipp.isep.dei.esoft.project.domain.Property;

import java.util.ArrayList;
import java.util.List;


public class PropertiesRepository {

    private final List<Property> properties = new ArrayList<>();

    public List<Property> getProperties() {
        return properties;
    }

    public Property getPropertyById(int propertyId) {
        Property propertyToGet = null;
        for (Property property: properties) {
            if (property.getPropertyId() == propertyId) {
                propertyToGet = property;
            }
        }
        return propertyToGet;
    }

    public void addProperty(Property propertyToAdd) {
        properties.add(propertyToAdd);
    }
}
