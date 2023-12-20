package lldprac.creational.factory.abstractFactory;

import lldprac.factory.abstractFactory.Button;
import lldprac.factory.abstractFactory.DarkButton;
import lldprac.factory.abstractFactory.DarkRadio;
import lldprac.factory.abstractFactory.DarkThemeFactory;
import lldprac.factory.abstractFactory.LightButton;
import lldprac.factory.abstractFactory.LightRadio;
import lldprac.factory.abstractFactory.LightThemeFactory;
import lldprac.factory.abstractFactory.Radio;
import lldprac.factory.abstractFactory.ThemeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThemeFactoryTest {
    @Test
    public void testDarkTheme() {

        lldprac.factory.abstractFactory.ThemeFactory darkThemeFactory = new DarkThemeFactory();

        lldprac.factory.abstractFactory.Button button = darkThemeFactory.createButton(10.0, null, 2.0);
        //button instanceOf DarkButton => Parent class object instance of child class object
        assertTrue(button instanceof DarkButton,
                "If the factory is dark, it should be a dark button"
        );

        lldprac.factory.abstractFactory.Radio radio = darkThemeFactory.createRadio();
        assertTrue(radio instanceof DarkRadio,
                "If the factory is Dark, it should be a Dark radio"
        );

    }

    @Test
    public void testLightTheme() {
        ThemeFactory lightThemeFactory = new LightThemeFactory();

        Button button = lightThemeFactory.createButton(10.0, 0.4, null);
        assertTrue(button instanceof LightButton,
                "If the factory is light, it should be a light button"
        );

        Radio radio = lightThemeFactory.createRadio();
        assertTrue(radio instanceof LightRadio,
                "If the factory is light, it should be a light radio"
        );

    }
}
