package solid.lsp.birdv3;

public abstract class NonFlyableBird extends Bird{

    public NonFlyableBird(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    public abstract void swim();

}
