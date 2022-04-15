package exercise5.task3;

public class Member {
    
    // attributes
    protected String name = null;
    protected int age = 0;
    protected String phoneNum = null;
    protected String address = null;
    protected double salary = 0.0;

    // constructors
    public Member (String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    // methods
    public void printSalary() {
        System.out.println(salary);
    }

    
    public String toString() {
        return "Name: " + name + "\tAge: " + age + "\tPhone: " + phoneNum + "\tAddress: " + address + "\tSalary: " + salary;
    }


}
