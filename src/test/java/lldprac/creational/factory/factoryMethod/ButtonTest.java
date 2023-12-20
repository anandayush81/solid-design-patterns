package lldprac.creational.factory.factoryMethod;

import lldprac.factory.factoryMethod.Button;
import lldprac.factory.factoryMethod.ButtonFactory;
import lldprac.factory.factoryMethod.RoundButton;
import lldprac.factory.factoryMethod.RoundButtonFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonTest {
    @Test
    public void testRoundButton(){
        //Condition dependency Injection -> @Qualifier
        ButtonFactory buttonFactory=new RoundButtonFactory(); //Because RoundButtonFactory is a ButtonFactory
        Button button=buttonFactory.createButton(10.0,0.4, null);
        //buttonFactory.createButton returns a RoundButton object. Now that is accepted as Button on the LHS
        //Basically it's: Button button = new RoundButton (which is correct since RoundButton is a Button)
        assertTrue(button instanceof RoundButton, "If screensize is phone, Round button should be returned");
    }
}

