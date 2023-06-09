package pt.ipp.isep.dei.esoft.project.ui;

import pt.ipp.isep.dei.esoft.project.application.controller.DisplayListedPropertiesController;
import pt.ipp.isep.dei.esoft.project.application.controller.PublishAnnouncementController;
import pt.ipp.isep.dei.esoft.project.application.controller.authorization.AuthenticationController;
import pt.ipp.isep.dei.esoft.project.domain.*;
import pt.ipp.isep.dei.esoft.project.repository.*;

import java.util.List;

public class Bootstrap implements Runnable {

    //Add some task categories to the repository as bootstrap
    public void run() {
        addRoles();
        addUsers();
    }

    private void addRoles() {
        AuthenticationRepository authenticationRepository = Repositories.getInstance().getAuthenticationRepository();
        authenticationRepository.addUserRole(AuthenticationController.ROLE_OWNER, "Owner");
        authenticationRepository.addUserRole(AuthenticationController.ROLE_SYSTEM_ADMINISTRATOR, "System Administrator");
        authenticationRepository.addUserRole(AuthenticationController.ROLE_CLIENT,"Client");
        authenticationRepository.addUserRole(AuthenticationController.ROLE_AGENT, "Agent");
        authenticationRepository.addUserRole(AuthenticationController.ROLE_AGENCY_MANAGER, "Agency Manager");
    }

    private void addUsers() {
        //TODO: add Authentication users here: should be created for each user in the organization
        AuthenticationRepository authenticationRepository = Repositories.getInstance().getAuthenticationRepository();
        authenticationRepository.addUserWithRole("System Administrator", "sysadmin@this.app", "admin", AuthenticationController.ROLE_SYSTEM_ADMINISTRATOR);
        authenticationRepository.addUserWithRole("Agent", "agent@this.app", "agent", AuthenticationController.ROLE_AGENT);
        authenticationRepository.addUserWithRole("Client","client@this.app","client",AuthenticationController.ROLE_CLIENT);
        // to test us5
        authenticationRepository.addUserWithRole("Agency Manager", "agencymanager@this.app", "agencymanager", AuthenticationController.ROLE_AGENCY_MANAGER);
    }


    // This method is mainly created to test the us 1
    private void addProperties() {
        DisplayListedPropertiesController displayListedPropertiesController = new DisplayListedPropertiesController();
        List<Property> properties = displayListedPropertiesController.getPropertiesToDisplay();
        Apartment apartment = new Apartment();
        House house = new House();
        Land land = new Land();
        properties.add(apartment);
        properties.add(house);
        properties.add(land);

    }

    /*private void addOrganization() {
        //TODO: add organizations bootstrap here
        //get organization repository
        OrganizationRepository organizationRepository = Repositories.getInstance().getOrganizationRepository();
        Organization organization = new Organization("This Company");
        organization.addEmployee(new Employee("admin@this.app"));
        organization.addEmployee(new Employee("employee@this.app"));
        organizationRepository.add(organization);
    }*/

    /*private void addTaskCategories() {
        //TODO: add bootstrap Task Categories here

        //get task category repository
        TaskCategoryRepository taskCategoryRepository = Repositories.getInstance().getTaskCategoryRepository();
        taskCategoryRepository.add(new TaskCategory("Analysis"));
        taskCategoryRepository.add(new TaskCategory("Design"));
        taskCategoryRepository.add(new TaskCategory("Implementation"));
        taskCategoryRepository.add(new TaskCategory("Development"));
        taskCategoryRepository.add(new TaskCategory("Testing"));
        taskCategoryRepository.add(new TaskCategory("Deployment"));
        taskCategoryRepository.add(new TaskCategory("Maintenance"));
    }*/






}
