package Fuentes;

public class Invoice implements Payable  
{
    private String partNumber;
    private String parteDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String parteDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.parteDescription = parteDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" + "partNumber=" + partNumber + ", parteDescription=" + parteDescription + ", quantity=" + quantity + ", pricePerItem=" + pricePerItem + '}';
    }
    
  
    @Override
    public double getPaymentAmount()
    {
        return quantity * pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getParteDescription() {
        return parteDescription;
    }

    public void setParteDescription(String parteDescription) {
        this.parteDescription = parteDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    
}
