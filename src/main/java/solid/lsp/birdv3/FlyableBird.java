package solid.lsp.birdv3;

public abstract class FlyableBird extends Bird{
    public FlyableBird(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    public abstract void fly();
}
