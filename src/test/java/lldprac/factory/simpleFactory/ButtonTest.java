package lldprac.factory.simpleFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
//We should think of factory when we have to create objects based on type
//Eg, here: if the screen is desktop, create round button object. If screen is mobile, create square button object
public class ButtonTest {
    @Test
    /*public void TestButton(){

    //When we test using this way, if the name of the button changes in the 3rd party code(here, the RoundButton
        and SquareButton, then our code will also break. Our code is this object creation code.
        But if we use Buttonfactory class, our code will not break, since we are not directly calling
        RoundButton or SquareButton
        RoundButton r1=new RoundButton(10.0,20.0);
        SquareButton b1=new SquareButton(5.0, 10.0);*//*

        Button r1=ButtonFactory.createButton(ScreenSize.PHONE, 10.0,20.0, null);
        Button b1=ButtonFactory.createButton(ScreenSize.DESKTOP, 10.0,null, 10.0);

    }*/

    public void testRoundButton() {
        //The point is we're not calling the RoundButton() ctor directly to create object.
        //Hence we're avoiding subclassing
        Button button = ButtonFactory.createButton(
                ScreenSize.PHONE, 10.0, 1.0, null
        );

        assertTrue(button instanceof RoundButton,
                "If the screen size is of a phone, the btn should be round"
        );
    }

    @Test
    public void testSquareButton() {
        Button button = ButtonFactory.createButton(
                ScreenSize.DESKTOP, 10.0, null, 10.0
        );

        assertTrue(button instanceof SquareButton,
                "If the screen size is of a desktop, the btn should be square"
        );
    }
}
// Why the factory pattern?
// 1. SRP and OCP =>> Done our code (test code) does not violate SRP and OCP
// 2. Complex construction logic ==> Done
// 3. Reduce usage of subclasses ==> Done

// What are the downsides of the simple factory?
// 1. Parameter explosion -> Assignment => Builder
// 2. SRP + OCP violation in library code
