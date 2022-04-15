package exercise5.task3;

public class Employee extends Member {
    
    // attributes
    // refer to Member class for superclass attributes
    private String specialisation = null;

    // constructors
    public Employee (String name, int age, String phoneNumber, String address, double salary, String specialisation) {
        super(name, age, phoneNumber, address, salary);
        setSpecialisation(specialisation);
    }


    // methods
    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    public String getSpecialisation() {
        return specialisation;
    }

    public String toString() {
        return super.toString() + "\tSpecialisation: " + specialisation;
    }

}
