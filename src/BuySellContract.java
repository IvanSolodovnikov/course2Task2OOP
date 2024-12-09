import java.util.Date;

public class BuySellContract {
    private String contractNumber;
    private Date conclusionDate;
    private Property property;
    private Client client;
    private Seller seller;
    private double transactionAmount;

    public BuySellContract(String contractNumber, Date conclusionDate, Property property, Client client, Seller seller, double transactionAmount) {
        this.contractNumber = contractNumber;
        this.conclusionDate = conclusionDate;
        this.property = property;
        this.client = client;
        this.seller = seller;
        this.transactionAmount = transactionAmount;
    }

    // Геттеры и сеттеры
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {

        this.contractNumber = contractNumber;
    }

    public Date getConclusionDate() {

        return conclusionDate;
    }

    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}