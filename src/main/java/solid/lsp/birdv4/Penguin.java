package solid.lsp.birdv4;

import solid.lsp.birdv3.NonFlyableBird;

public class Penguin extends Bird implements Swimmable {


    public Penguin(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    @Override
    public void swim() {
        System.out.println("Penguin is Swimming");

    }
}
