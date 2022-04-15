package tutorial5.task1;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    // attributes
    private double baseSalary;

    // constructors
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSale, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSale);
        this.baseSalary = baseSalary;
    }

    // methods
    public double earnings() {
        return baseSalary + super.earnings();
    }

    public String toString() {
        return "Base-Salaried Employee: " + firstName + " " + lastName + "\n"
            + "Social security number: " + socialSecurityNumber + "\n"
            + "Gross sales: " + grossSale + "\n"
            + "Commission rate: " + commissionRate + "\n"
            + "Base salary: " + earnings();
    }

}
