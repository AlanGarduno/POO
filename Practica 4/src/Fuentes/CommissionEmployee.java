package Fuentes;

public class CommissionEmployee extends Employee
{
    private double grossSales;
    private double  comissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    
    @Override
    public double getPaymentAmount() 
    {
        return grossSales + comissionRate;
    }
}
