package solid.lsp.birdv4;

//import solid.lsp.birdv3.BirdType;
//import solid.lsp.birdv3.Color;
//import solid.lsp.birdv3.Eagle;
//import solid.lsp.birdv3.Penguin;
//import solid.lsp.birdv3.Size;
//import solid.lsp.birdv3.Sparrow;
//import solid.lsp.birdv3.Swan;
//import solid.lsp.birdv3.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        Eagle e=new Eagle("Eagle1",2.0, BirdType.EAGLE, Color.RED, Size.LARGE); //Not correct way, code to interface
//        Sparrow s=new Sparrow("Sparrow1",2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL);
//        e.fly();
//        s.fly();
//        e.eat();
//        s.eat();
        Eagle e=new Eagle("Eagle1",2.0, BirdType.EAGLE, Color.RED, Size.LARGE);
        Sparrow s=new Sparrow("Sparrow1",2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL);
        e.fly(); //Bird class does not have fly() method
        s.fly();//Bird class does not have fly() method
        e.eat();
        s.eat();

        //fly method is in Flyable interface, so we can type cast it to Flyable, if we want to fly

        Flyable e2=new Eagle("Eagle1",2.0, BirdType.EAGLE, Color.RED, Size.LARGE);
        Flyable s2=new Sparrow("Sparrow1",2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL);
        e2.fly(); //Bird class does not have fly() method
        s2.fly();//Bird class does not have fly() method

        //Make all birds fly using a different method

        List<Flyable> birds=new ArrayList<>();
        birds.add(e2);
        birds.add(s2);
        flyAll(birds);

        ///we can pass objects of child class as well
        List<Flyable> birds2=new ArrayList<>();
        birds.add(e);
        birds.add(s);
        flyAll(birds);




        Penguin p=new Penguin("Penguin1",10.0, BirdType.PENGUIN, Color.BLUE, Size.LARGE);
        p.swim();
        p.eat();
        Swan sw=new Swan("Swan1",10.0, BirdType.SWAN, Color.BLUE, Size.MEDIUM);
        sw.fly();
        sw.swim();
        sw.eat();

        /*Bird sw2=new Swan("Swan1",10.0, BirdType.SWAN, Color.BLUE, Size.MEDIUM);
        sw2.fly();
        sw2.swim();
        sw2.eat();*/

        //One problem here is that how to make a Swan fly and swim using a prent class object like
        //either Bird or FLyable or Swimmable

    }

    private static void flyAll(List<Flyable> birds) {
        /*for(FlyableBird bird:birds){
            bird.fly();
        }*/

        // VVI Using method References
        birds.forEach(Flyable::fly);
    }
}
