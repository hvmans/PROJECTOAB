package pt.ipp.isep.dei.esoft.project.domain;

public class House extends Property {


    private int n_bedrooms;
    private int n_bathrooms;
    private int n_parkingSpaces;

    private String avaibleEquipment;
    private boolean existBasement;
    private boolean existinhabitableLoft;
    private String sunExposure;

    public House(String propertyType, String location, double area, double distanceCenter, String photos, Owner owner, int n_bedrooms, int n_bathrooms, int n_parkingSpaces, String avaibleEquipment, boolean existBasement, boolean existinhabitableLoft, String sunExposure) {
        super(propertyType, location, area, distanceCenter, photos, owner);
        this.n_bedrooms = n_bedrooms;
        this.n_bathrooms = n_bathrooms;
        this.n_parkingSpaces = n_parkingSpaces;
        this.avaibleEquipment = avaibleEquipment;
        this.existBasement = existBasement;
        this.existinhabitableLoft = existinhabitableLoft;
        this.sunExposure = sunExposure;
    }

    public House(int n_bedrooms, int n_bathrooms, int n_parkingSpaces, String avaibleEquipment, boolean existBasement, boolean existinhabitableLoft, String sunExposure) {
        this.n_bedrooms = n_bedrooms;
        this.n_bathrooms = n_bathrooms;
        this.n_parkingSpaces = n_parkingSpaces;
        this.avaibleEquipment = avaibleEquipment;
        this.existBasement = existBasement;
        this.existinhabitableLoft = existinhabitableLoft;
        this.sunExposure = sunExposure;
    }

    public int getN_bedrooms() {
        return n_bedrooms;
    }

    public void setN_bedrooms(int n_bedrooms) {
        this.n_bedrooms = n_bedrooms;
    }

    public int getN_bathrooms() {
        return n_bathrooms;
    }

    public void setN_bathrooms(int n_bathrooms) {
        this.n_bathrooms = n_bathrooms;
    }

    public int getN_parkingSpaces() {
        return n_parkingSpaces;
    }

    public void setN_parkingSpaces(int n_parkingSpaces) {
        this.n_parkingSpaces = n_parkingSpaces;
    }

    public String getAvaibleEquipment() {
        return avaibleEquipment;
    }

    public void setAvaibleEquipment(String avaibleEquipment) {
        this.avaibleEquipment = avaibleEquipment;
    }

    public boolean isExistBasement() {
        return existBasement;
    }

    public void setExistBasement(boolean existBasement) {
        this.existBasement = existBasement;
    }

    public boolean isExistinhabitableLoft() {
        return existinhabitableLoft;
    }

    public void setExistinhabitableLoft(boolean existinhabitableLoft) {
        this.existinhabitableLoft = existinhabitableLoft;
    }

    public String getSunExposure() {
        return sunExposure;
    }

    public void setSunExposure(String sunExposure) {
        this.sunExposure = sunExposure;
    }
}