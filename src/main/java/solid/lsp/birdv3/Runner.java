package solid.lsp.birdv3;

import solid.lsp.birdv4.Flyable;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Eagle e=new Eagle("Eagle1",2.0, BirdType.EAGLE, Color.RED, Size.LARGE); //Not correct way, code to interface
        Sparrow s=new Sparrow("Sparrow1",2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL);
        e.fly();
        s.fly();
        e.eat();
        s.eat();
//        Bird e=new Eagle("Eagle1",2.0, BirdType.EAGLE, Color.RED, Size.LARGE);
//        Bird s=new Sparrow("Sparrow1",2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL);
//        e.fly(); //Bird class does not have fly() method
//        s.fly();//Bird class does not have fly() method
//        e.eat();
//        s.eat();

        //fly method is in FlyableBird Abstract class, so we can type cast it to Flyable, if we want to fly

        FlyableBird e2=new Eagle("Eagle1",2.0, BirdType.EAGLE, Color.RED, Size.LARGE);
        FlyableBird s2=new Sparrow("Sparrow1",2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL);
        e2.fly(); //Bird class does not have fly() method
        s2.fly();//Bird class does not have fly() method

        //Make all birds fly using a different method

        List<FlyableBird> birds=new ArrayList<>();
        birds.add(e2);
        birds.add(s2);
        flyAll(birds);

        List<FlyableBird> birds2=new ArrayList<>();
        birds.add(e);
        birds.add(s);
        flyAll(birds2);




        Penguin p=new Penguin("Penguin1",10.0,BirdType.PENGUIN,Color.BLUE,Size.LARGE);
        p.swim();
        p.eat();
        Swan sw=new Swan("Swan1",10.0,BirdType.SWAN,Color.BLUE,Size.MEDIUM);
        sw.fly();
        sw.swim();
        sw.eat();
    }

    private static void flyAll(List<FlyableBird> birds) {
        /*for(FlyableBird bird:birds){
            bird.fly();
        }*/

        // VVI Using method References
        birds.forEach(FlyableBird::fly);
    }
}
