package tutorial5.task1;

/**
 * CommissionEmployee
 */
public class CommissionEmployee {

    // attributes
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double commissionRate;
    protected double grossSale;

    // constructors
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    // methods
    public double earnings() {
        return grossSale * commissionRate;
    }

    public String toString() {
        return "Commission Employee: " + firstName + " " + lastName + "\n"
            + "Social security number: " + socialSecurityNumber + "\n"
            + "Gross sales: " + grossSale + "\n"
            + "Commission rate: " + commissionRate + "\n"
            + "Base salary: " + earnings();
    }

}