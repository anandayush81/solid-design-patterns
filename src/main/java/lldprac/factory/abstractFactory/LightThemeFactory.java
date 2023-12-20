package lldprac.factory.abstractFactory;

public class LightThemeFactory implements ThemeFactory{

    @Override
    public Button createButton(Double border, Double length, Double radius) {
        return new LightButton(border, length);
    }

    @Override
    public Radio createRadio() {
        return new LightRadio();
    }
}
