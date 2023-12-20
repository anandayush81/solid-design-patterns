package solid.lsp.birdv3;

public class Penguin extends NonFlyableBird{


    public Penguin(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    @Override
    public void swim() {
        System.out.println("Penguin is Swimming");

    }
}
