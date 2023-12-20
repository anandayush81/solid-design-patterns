package solid.DI.Birdv5;

import solid.lsp.birdv4.Singable;

public class Sparrow extends Bird implements Flyable, Singable {


    public Sparrow(String name, Double weight, BirdType type, Color color, Size size, Beak beak) {
        super(name, weight, type, color, size, beak);
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
