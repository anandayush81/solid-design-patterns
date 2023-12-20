package lldprac.factory.simpleFactory;

public class ButtonFactory {
    // Step 3 - Create a static factory method
    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch (screenSize) {

            /*case PHONE: return new RoundButton(border, radius);
            case TABLET: return new RoundButton(border, radius);
            case DESKTOP: return new SquareButton(border, length);*/

            // OR

            case PHONE:
            case TABLET:  return new RoundButton(border, radius);
            case DESKTOP: return new SquareButton(border, length);

        }
        //Never add a default case in switch case as that can lead to bugs since it will create object
        //for undefined case as well. Always throw an error instead
        throw new IllegalArgumentException("Invalid type: " + screenSize);

    }
}
