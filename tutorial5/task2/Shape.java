package tutorial5.task2;

public class Shape {
    
    // attributes
    protected double dimension;

    // constructors
    public Shape(double dimension) {
        this.dimension = dimension;
    }
    
    // methods
    public double calculateArea() {
        return dimension;
    }

    public double calculatePerimeter() {
        return dimension;
    }

    public String shape() {
        return "Shape";
    }

}
