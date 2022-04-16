package tutorial5.task4;

public class Bird extends Animal {
    
    // attributes
    private static final double DISTANCE = 0.2;

    // constructors
    public Bird(String environment, String movingDirection, String typeOfAnimal) {
        super(environment, movingDirection, typeOfAnimal);
    }

    // methods
    // getters/setters
    public static double getDistance() {
        return DISTANCE;
    }
    
    // functions
    @Override
    public double calculateLocation() {
        return super.calculateLocation() + getDistance();
    }

    @Override
    public String wayOfMove() {
        return "flying";
    }
    
}
