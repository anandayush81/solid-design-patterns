package lldprac.creational.factory.factoryMethod;

public class SquareButtonFactory implements ButtonFactory {
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new RoundButton(border,length);
    }
}
