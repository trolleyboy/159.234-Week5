package tutorial5.task2;

public class Circle extends Shape {
    
    // attributes

    // constructors
    public Circle(double radius) {
        super(radius);
    }

    // methods
    public double calculateArea() {
        return dimension * dimension * 3.14;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * dimension;
    }

    public String shape() {
        return "Circle";
    }
}
