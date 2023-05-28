package pt.ipp.isep.dei.esoft.project.application.controller;

import pt.ipp.isep.dei.esoft.project.domain.Property;
import pt.ipp.isep.dei.esoft.project.repository.PropertiesRepository;
import pt.ipp.isep.dei.esoft.project.repository.Repositories;

import java.util.List;

public class DisplayListedPropertiesController {

    private PropertiesRepository propertiesRepository = null;

    public DisplayListedPropertiesController() {
        getPropertiesRepository();
    }

    private PropertiesRepository getPropertiesRepository() {
        if (propertiesRepository == null) {
            Repositories repositories = Repositories.getInstance();
            propertiesRepository = repositories.getPropertiesRepository();
        }
        return propertiesRepository;
    }

    public List<Property> getPropertiesToDisplay() {
        return getPropertiesRepository().getProperties();
    }


}
