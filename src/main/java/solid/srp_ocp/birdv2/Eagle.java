package solid.srp_ocp.birdv2;

public class Eagle extends Bird{

    //Since the attributes of Eagle are declared in Bird class, which is it's parent class,
    //we need to create a constructor of child class and send all attributes this child class received while creating it's object
    //to it's parent class using super()
    public Eagle(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}
