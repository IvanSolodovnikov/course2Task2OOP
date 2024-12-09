public class CommercialProperty extends Property {
    private String businessType;

    {
        System.out.println("CommercialProperty instance block");
    }


    public CommercialProperty(String address, double cost, String businessType) {
        super(address, "Commercial", cost);
        System.out.println("CommercialProperty constructor");
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}