package tutorial5.task2;

public class Triangle extends Shape {
    
    // attributes

    // constructors
    public Triangle(double length) {
        super(length);
    }

    // methods
    public double calculateArea() {
        return dimension * dimension * 0.433;
    }

    public double calculatePerimeter() {
        return 3 * dimension;
    }

    public String shape() {
        return "Triangle";
    }
}
