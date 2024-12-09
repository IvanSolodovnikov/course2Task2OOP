public class ResidentialProperty extends Property {
    private int numberOfBedrooms;

    {
        System.out.println("ResidentialProperty instance block");
    }

    public ResidentialProperty(String address,  double cost, int numberOfBedrooms) {
        super(address, "Residential", cost);
        System.out.println("ResidentialProperty constructor");
        this.numberOfBedrooms = numberOfBedrooms;
    }



    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
}
