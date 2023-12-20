package solid.DI.Birdv5;


public class Runner {
    public static void main(String[] args) {
        StrongBeak beak1 = new StrongBeak(100.0, "Calcium");
        WeakBeak beak2=new WeakBeak(50.0, "Rubber");
        Beak beak3=new WeakBeak(50.0, "Rubber");
        //In the Bird class, we have specified StronBeak, which is wrong
        //Not every bird will have a strong beak, some may have waek bea as well.
        //So we need to specify Beak, not it's child class
        Eagle e = new Eagle("Eagle1", 2.0, BirdType.EAGLE, Color.RED, Size.LARGE, beak1);
        Sparrow s = new Sparrow("Sparrow1", 2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL, beak2);
        Sparrow s2 = new Sparrow("Sparrow2", 2.0, BirdType.SPARROW, Color.GREEN, Size.SMALL, beak3);


        e.fly();
        s.fly();
        e.eat();
        s.eat();

        s2.fly();





        /*Eagle e=new Eagle("Eagle1",2.0, BirdType.EAGLE, Color.RED, Size.LARGE);
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






        Penguin p=new Penguin("Penguin1",10.0, BirdType.PENGUIN, Color.BLUE, Size.LARGE);
        p.swim();
        p.eat();
        Swan sw=new Swan("Swan1",10.0, BirdType.SWAN, Color.BLUE, Size.MEDIUM);
        sw.fly();
        sw.swim();
        sw.eat();*/

    }
}
