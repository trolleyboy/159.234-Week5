package tutorial5.task4;

public class Fish extends Animal {
    
    // attributes
    private static final double CIRCLES = 8;

    // constructors
    public Fish(String environment, String movingDirection, String typeOfAnimal) {
        super(environment, movingDirection, typeOfAnimal);
    }

    // methods
    // getters/setters
    public static double getCircles() {
        return CIRCLES;
    }
    
    // functions
    @Override
    public double calculateLocation() {
        return super.calculateLocation() + (getCircles() * 0.02);
    }

    @Override
    public String wayOfMove() {
        return "swimming";
    }
    
}
