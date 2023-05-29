package pt.ipp.isep.dei.esoft.project.repository;

public class Repositories {

    private static final Repositories instance = new Repositories();
    TaskCategoryRepository taskCategoryRepository = new TaskCategoryRepository();
    OrganizationRepository organizationRepository = new OrganizationRepository();

    AuthenticationRepository authenticationRepository = new AuthenticationRepository();
    AnnouncementRepository announcementRepository = new AnnouncementRepository();
    PropertiesRepository propertiesRepository = new PropertiesRepository();
    RequestRepository requestRepository = new RequestRepository();
    AgencyRepository agencyRepository = new AgencyRepository();


    private Repositories() {
    }

    public static Repositories getInstance() {
        return instance;
    }

    public OrganizationRepository getOrganizationRepository() {
        return organizationRepository;
    }

    public TaskCategoryRepository getTaskCategoryRepository() {
        return taskCategoryRepository;
    }

    public AuthenticationRepository getAuthenticationRepository() {
        return authenticationRepository;
    }

    public AnnouncementRepository getAnnouncementRepository() {
        return announcementRepository;
    }

    public PropertiesRepository getPropertiesRepository() {
        return propertiesRepository;
    }

    public RequestRepository getRequestRepository() {
        return requestRepository;
    }

    public AgencyRepository getAgencyRepository() {
        return agencyRepository;
    }

}
