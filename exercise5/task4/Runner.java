package exercise5.task4;

public class Runner {

    // attributes
    private static Square[] squares = new Square[10];
    public static void main(String[] args) {
        
        Square square = new Square(2.0);
        Rectangle rectangle = new Rectangle(2.0, 3.0);

        System.out.print("Square: ");
        square.printArea();

        System.out.print("Rectangle: ");
        rectangle.printArea();

        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(i * 2.0);
        }

        for (Square s : squares) {
            System.out.print("Square: ");
            s.printArea();
        }

    }
}
