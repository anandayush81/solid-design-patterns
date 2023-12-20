package solid.DI.Birdv5;

public class Penguin extends Bird implements Swimmable {


    public Penguin(String name, Double weight, BirdType type, Color color, Size size, StrongBeak beak) {
        super(name, weight, type, color, size, beak);
    }

    @Override
    public void swim() {
        System.out.println("Penguin is Swimming");

    }
}
