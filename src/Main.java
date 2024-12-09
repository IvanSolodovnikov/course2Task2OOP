public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a Client:");
        Client client = new Client("John Doe", "123-456-7890", 100000.0);


        System.out.println("\nCreating a ResidentialProperty:");
        ResidentialProperty resProp = new ResidentialProperty("123 Elm St",  350000.0, 0);
    }
}