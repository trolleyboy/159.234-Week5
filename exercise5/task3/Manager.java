package exercise5.task3;

public class Manager extends Member {
    
    // attributes
    // refer to Member class for superclass attributes
    private String department = null;

    // constructors
    public Manager (String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        setDepartment(department);
    }


    // methods
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public String toString() {
        return super.toString() + "\tDepartment: " + department;
    }

}
