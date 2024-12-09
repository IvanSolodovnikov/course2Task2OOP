public class Human {
    private String name;

    private String contactInformation;

    {
        System.out.println("Human instance block");
    }
    static {
        System.out.println("Human static block");
    }

    public Human(String name, String contactInformation) {
        System.out.println("Human constructor");
        this.name = name;
        this.contactInformation = contactInformation;
    }



public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
