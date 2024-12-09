public class Client extends Human {
    static int v(int val) {
        System.out.println("Value " + val);
        return val;
    }
    private double budget;

    {
        System.out.println("Client instance block");
    }
    static int a;
    static int b = v(1);

    static{
        System.out.println("begin static block");
        String name = "Vasia";
        String contactInformation = "999-89-99";
        double budget = 0.0;
        d = v(2);
        a = v(3);
        System.out.println("Client static block");
    }

    static int c = v(4);


    static int d;


    public Client(String name, String contactInformation, double budget) {
        super(name, contactInformation);
        System.out.println("Client constructor");
        this.budget = budget;
    }




    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
