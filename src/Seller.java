public class Seller extends Human {

    {
        System.out.println("Seller instance block");
    }
    public Seller(String name, String contactInformation) {
       super(name, contactInformation);
        System.out.println("Seller constructor");
    }
}