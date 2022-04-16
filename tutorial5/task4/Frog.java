package tutorial5.task4;

public class Frog extends Animal {
    
    // attributes
    private static final double JUMPS = 5;

    // constructors
    public Frog(String environment, String movingDirection, String typeOfAnimal) {
        super(environment, movingDirection, typeOfAnimal);
    }

    // methods
    // getters/setters
    public static double getJumps() {
        return JUMPS;
    }
    
    // functions
    @Override
    public double calculateLocation() {
        return super.calculateLocation() + (getJumps() * 0.07);
    }

    @Override
    public String wayOfMove() {
        return "Jumping";
    }
    
}
