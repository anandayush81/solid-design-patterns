package solid.lsp.birdv4;

import solid.lsp.birdv3.FlyabaleAndSwimmableBird;

public class Swan extends Bird implements Flyable, Swimmable {

    public Swan(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    @Override
    public void fly() {
        System.out.println("Swan is Flying");
    }

    @Override
    public void swim() {
        System.out.println("Swan is Swimming");
    }
}
