package exercise5.task3;

public class Runner {
    
    public static void main(String[] args) {
        
        Manager manager = new Manager(
            "Rob", 38, "0272334445", "20 Fearnley Grove", 135000.00, "IT"
        );

        Employee employee = new Employee(
            "Becs", 33, "0273692821", "20 Fearnley Grove", 135000.00, "Cafe"
        );

        System.out.println(employee.toString());
        System.out.println(manager.toString());
    }
}
