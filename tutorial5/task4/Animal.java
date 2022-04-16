package tutorial5.task4;

public class Animal {
    
    // attributes
    private String environment;
    private String movingDirection;
    private String typeOfAnimal;
    private double currentPosition;

    // constructors
    public Animal(String environment, String movingDirection, String typeOfAnimal) {
        this.environment = environment;
        this.movingDirection = movingDirection;
        this.typeOfAnimal = typeOfAnimal;
        currentPosition = 0;
    }

    // methods
    // getters/setters
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getMovingDirection() {
        return movingDirection;
    }

    public void setMovingDirection(String movingDirection) {
        this.movingDirection = movingDirection;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public double getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(double currentPosition) {
        this.currentPosition = currentPosition;
    }

    // functions
    public double calculateLocation () {
        return getCurrentPosition();
    }

    public String wayOfMove() {
        return "";
    }

    @Override
    public String toString() {
        return "Animal " + getTypeOfAnimal() + " is living in " + getEnvironment() + ", "
         + wayOfMove() + " to the " + getMovingDirection() + " and its current position is "
         + calculateLocation() + " meters from the origin.\n";
    }
    
}
