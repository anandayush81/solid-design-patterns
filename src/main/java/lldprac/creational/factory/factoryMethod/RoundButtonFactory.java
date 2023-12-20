package lldprac.creational.factory.factoryMethod;

public class RoundButtonFactory implements ButtonFactory {
    @Override
    //notice how the return type is parent class object (Button) despite actually making a RoundButton object
    ///This is equivalent to: Button obj=new RoundButton();
    //Basically RoundButton is a Button, so we can return Button and RoundButton both

    public Button createButton(Double border, Double radius, Double length) {

        return new RoundButton(border, radius);
    }
}

