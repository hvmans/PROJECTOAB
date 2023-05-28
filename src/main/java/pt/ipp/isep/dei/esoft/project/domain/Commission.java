package pt.ipp.isep.dei.esoft.project.domain;

public class Commission {

    private final String COMMISSION_TYPE_FIXED = "fixed";
    private final String COMMISSION_TYPE_PERCENTAGE = "percentage";
    private String type; // Commision can either be a fixed value or a percentage of the sale.
    private double value;

    public Commission() {

    }

    public Commission(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setCommissionTypeFixed() {
        this.type = COMMISSION_TYPE_FIXED;
    }

    public void setCommissionTypePercentage() {
        this.type = COMMISSION_TYPE_PERCENTAGE;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


}
