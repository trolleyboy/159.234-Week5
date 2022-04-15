package exercise5.task4;

public class Rectangle {
    
    // attributes
    private double length;
    private double breadth;

    // constructors

    public Rectangle(double x, double y) {
        length = x;
        breadth = y;
    }

    // methods
    public void printArea() {
        double area = length * breadth;
        System.out.println(area);
    }
}
