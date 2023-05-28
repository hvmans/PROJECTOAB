package pt.ipp.isep.dei.esoft.project.domain;

public class House extends Apartment {

    private boolean existBasement;
    private boolean existInhabitableLoft;
    private String sunExposure;

    public House() {
        super();
    }

    public House(String location, double area, double distanceCenter, String photos, Owner owner, int numberBedrooms, int numberBathrooms, int numberParkingSpaces, String availableEquipment, boolean existBasement, boolean existInhabitableLoft, String sunExposure) {
        super(location, area, distanceCenter, photos, owner, numberBedrooms, numberBathrooms, numberParkingSpaces, availableEquipment);
        this.existBasement = existBasement;
        this.existInhabitableLoft = existInhabitableLoft;
        this.sunExposure = sunExposure;
    }


    public boolean isExistBasement() {
        return existBasement;
    }

    public void setExistBasement(boolean existBasement) {
        this.existBasement = existBasement;
    }

    public boolean isExistInhabitableLoft() {
        return existInhabitableLoft;
    }

    public void setExistInhabitableLoft(boolean existInhabitableLoft) {
        this.existInhabitableLoft = existInhabitableLoft;
    }

    public String getSunExposure() {
        return sunExposure;
    }

    public void setSunExposure(String sunExposure) {
        this.sunExposure = sunExposure;
    }

}