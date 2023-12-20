package lldprac.creational.factory.abstractFactory;

public interface ThemeFactory {
    Button createButton(Double border, Double length, Double radius);
    Radio createRadio();
}
