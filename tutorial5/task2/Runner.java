package tutorial5.task2;

public class Runner {
    
    private static Shape[] shapes = new Shape[3];

    public static void main(String[] args) {
        
        shapes[0] = new Circle(3);
        shapes[1] = new Square(3);
        shapes[2] = new Triangle(3);

        for ( Shape s : shapes ) {
            System.out.println("The shape is a: " + s.shape());
            System.out.println("It's dimension is: " + s.dimension);
            System.out.println("It's area is: " + s.calculateArea());
            System.out.println("It's perimeter is: " + s.calculatePerimeter());
            System.out.println("");
        }
    }

}
