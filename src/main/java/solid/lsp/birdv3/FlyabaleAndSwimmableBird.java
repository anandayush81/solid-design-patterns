package solid.lsp.birdv3;

public abstract class FlyabaleAndSwimmableBird extends Bird{

    public FlyabaleAndSwimmableBird(String name, Double weight, BirdType type, Color color, Size size) {
        super(name, weight, type, color, size);
    }

    public abstract void fly();
    public abstract void swim();
}
