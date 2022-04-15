package tutorial5.task1;

public class Runner {

    private static CommissionEmployee commEmp = new CommissionEmployee(
        "Rob", "Angell", "111-222", 0.04, 5000);
    private static BasePlusCommissionEmployee salaryEmp = new BasePlusCommissionEmployee(
        "Becs", "Angell", "999-888", 0.02, 5000, 1000);
        
    public static void main(String[] args) {
        
        System.out.println(commEmp.toString());
        System.out.println(salaryEmp.toString());
    }

}
