public class Property {
    private static String type = initType();
    private String address = initAddress();
    private double cost;


    {
        System.out.println("Property instance block");

    }
    static {
        System.out.println("Static block in Property");
    }

    public Property(String address, String type, double cost) {
        System.out.println("Property constructor");
        this.type = type;
        this.address = address;
        this.cost = cost;
    }

    private static String initType() {
        System.out.println("Initializing static type in Property");
        return "Unknown";
    }

    private String initAddress() {
        System.out.println("Initializing address in Property");
        return "Unknown";
    }

    private double initCost() {
        System.out.println("Initializing cost in Property");
        return -1.0;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}