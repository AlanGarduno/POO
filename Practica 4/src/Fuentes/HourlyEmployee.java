package Fuentes;

public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;

    
    public HourlyEmployee(double wage, double hours, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }
    
    

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return wage*hours;
    }
    
    
    
}
