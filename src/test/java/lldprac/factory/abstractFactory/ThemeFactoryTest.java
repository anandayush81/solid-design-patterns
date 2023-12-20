package lldprac.factory.abstractFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThemeFactoryTest {
    @Test
    public void testDarkTheme() {

        ThemeFactory darkThemeFactory = new DarkThemeFactory();

        Button button = darkThemeFactory.createButton(10.0, null, 2.0);
        //button instanceOf DarkButton => Parent class object instance of child class object
        assertTrue(button instanceof DarkButton,
                "If the factory is dark, it should be a dark button"
        );

        Radio radio = darkThemeFactory.createRadio();
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
