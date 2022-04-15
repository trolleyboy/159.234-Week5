package exercise5.task1;

public class Runner {
    
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.parentOutput();
        child.childOutput();
        child.parentOutput();

    }
}
