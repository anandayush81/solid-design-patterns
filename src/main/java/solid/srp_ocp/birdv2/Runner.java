package solid.srp_ocp.birdv2;

public class Runner {
    public static void main(String[] args) {
        /*Eagle e=new Eagle("Eagle1",2.0,BirdType.EAGLE,Color.RED,Size.LARGE);
        Sparrow s=new Sparrow("Sparrow1",2.0,BirdType.SPARROW,Color.GREEN,Size.SMALL);
        e.fly();
        s.fly();
        e.eat();
        s.eat();*/

        Bird e=new Eagle("Eagle1",2.0,BirdType.EAGLE,Color.RED,Size.LARGE);
        Bird s=new Sparrow("Sparrow1",2.0,BirdType.SPARROW,Color.GREEN,Size.SMALL);
        e.fly();
        s.fly();
        e.eat();
        s.eat();
    }
}
