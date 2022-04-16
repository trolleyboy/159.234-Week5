package tutorial5.task3;

public class Course {
    
    // attributes
    protected static final double BaseFeePerPersonPerDay = 100.00;
    protected static final double LaptopRentalPerPersonPerDay = 20.00;
    protected static final double volumeDiscount = 10.00;
    protected boolean laptopRenting;
    protected int numberOfPeople;

    // constructors
    public Course(int attendees,boolean laptopRenters) {
        setLaptopRenting(laptopRenters);
        setNumberOfPeople(attendees);
    }

    // methods
    // getters/setters
    public boolean getLaptopRenting() {
        return laptopRenting;
    }

    public void setLaptopRenting(boolean laptopRenting) {
        this.laptopRenting = laptopRenting;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public static double getBasefeeperpersonperday() {
        return BaseFeePerPersonPerDay;
    }

    public static double getLaptoprentalperpersonperday() {
        return LaptopRentalPerPersonPerDay;
    }

    public static double getVolumediscount() {
        return volumeDiscount;
    }

    // functions
    public double calculateRentingCostPerPersonPerDay() {
        if (getLaptopRenting()) {
            return getLaptoprentalperpersonperday();
        } else {
            return 0;
        }
    }

    public double calculateTotalCost() {
        return getBasefeeperpersonperday() + calculateRentingCostPerPersonPerDay();
    }
    
}
