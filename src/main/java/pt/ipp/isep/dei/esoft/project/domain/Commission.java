package pt.ipp.isep.dei.esoft.project.domain;

public class Commission {
    /**
     * commision can either be a fixed value or a percentage of the sale .
     */
    private String type;
    private double value;

    public Commission(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
