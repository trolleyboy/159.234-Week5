package tutorial5.task3;

public class OneDayCourse extends Course {
    
    // attributes
    private boolean extraMaterial;
    private static final double extraMaterialCost = 10.00;

    // constructors
    public OneDayCourse(int attendees,boolean laptopRenters, boolean extraMaterial) {
        super(attendees, laptopRenters);
        setExtraMaterial(extraMaterial);
    }

    // methods
    // getters/setters
    public boolean isExtraMaterial() {
        return extraMaterial;
    }

    public void setExtraMaterial(boolean extraMaterial) {
        this.extraMaterial = extraMaterial;
    }

    public static double getExtramaterialcost() {
        return extraMaterialCost;
    }

    // functions
    public double calculateExtraMaterialCostPerPerson() {
        if (isExtraMaterial()) {
            return getExtramaterialcost();
        } else {
            return 0;
        }
    }

    @Override
    public double calculateTotalCost() {
        double totalCost = super.calculateTotalCost() + calculateExtraMaterialCostPerPerson();
        if (super.getNumberOfPeople() >= 10) {
            totalCost *= 0.9;
        }
        totalCost *= super.getNumberOfPeople();
        return totalCost;
    }

}
