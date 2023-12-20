package solid.DI.Birdv5;

public class Eagle extends Bird implements Flyable {
    public Eagle(String name, Double weight, BirdType type, Color color, Size size, StrongBeak beak) {
        super(name, weight, type, color, size, beak);
    }

    //Since the attributes of Eagle are declared in Bird class, which is it's parent class,
    //we need to create a constructor of child class and send all attributes this child class received while creating it's object
    //to its parent class using super()


    @Override
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}
