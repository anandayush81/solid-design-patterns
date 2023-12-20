package solid.lsp.birdv4;

import solid.lsp.birdv3.FlyabaleAndSwimmableBird;
import solid.lsp.birdv3.FlyableBird;

public class Sparrow extends Bird implements Flyable, Singable {
    public Sparrow(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is Flying");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow is Singing");

    }
}
