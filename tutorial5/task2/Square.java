package tutorial5.task2;

public class Square extends Shape {
    
    // attributes

    // constructors
    public Square(double length) {
        super(length);
    }

    // methods
    public double calculateArea() {
        return dimension * dimension;
    }

    public double calculatePerimeter() {
        return 4 * dimension;
    }

    public String shape() {
        return "Square";
    }
}
