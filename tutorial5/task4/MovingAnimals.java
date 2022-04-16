package tutorial5.task4;

public class MovingAnimals {
    
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Bird("Sky", "North", "Bird");
        animals[1] = new Fish("Water", "East", "Fish");
        animals[2] = new Frog("Land & Water", "West", "Frog");

        for ( Animal a : animals ) {
            System.out.println(a.toString());
        }
    }

}
