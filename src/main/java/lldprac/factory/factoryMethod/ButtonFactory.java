package lldprac.factory.factoryMethod;

public interface ButtonFactory {
    //Factory Method
    public Button createButton(Double border, Double radius, Double length);
}
