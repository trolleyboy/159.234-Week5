package tutorial5.task3;

public class ThreeDayCourse extends Course {
    
    // attributes
    private boolean eveningLab;
    private static final double eveningLabCost = 60.00;

    // constructors
    public ThreeDayCourse(int attendees,boolean laptopRenters, boolean eveningLab) {
        super(attendees, laptopRenters);
        setEveningLab(eveningLab);
    }

    // methods
    // getters/setters
    public boolean isEveningLab() {
        return eveningLab;
    }

    public void setEveningLab(boolean eveningLab) {
        this.eveningLab = eveningLab;
    }

    public static double getEveningLabcost() {
        return eveningLabCost;
    }

    // functions
    public double calculateEveningLabCostPerPerson() {
        if (isEveningLab()) {
            return getEveningLabcost();
        } else {
            return 0;
        }
    }

    @Override
    public double calculateTotalCost() {
        double totalCost = super.calculateTotalCost() + calculateEveningLabCostPerPerson();
        if (super.getNumberOfPeople() >= 10) {
            totalCost *= 0.9;
        }
        totalCost *= super.getNumberOfPeople();
        return totalCost;
    }

}
