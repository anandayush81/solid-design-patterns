package solid.srp_ocp.birdv1;

public class Bird {
    private String name;
    private Double weight;
    private BirdType type;
    private Color color;
    private Size size;
    //Birds may sleep and eat the same. But they fly differently
    public void fly(){ //If else ladder. Violtaes SRP
        //If i have to add a new bird, I'll hae to modify this function
        if(type==BirdType.EAGLE){
            System.out.println("Eagle is Flying");
        }
        else if(type==BirdType.PEACOCK){
            System.out.println("Peacock is Flying");
        }
        else if(type==BirdType.SPARROW){
            System.out.println("Sparrow is Flying");
        }
    }
    public void eat(){
        System.out.println("I'm Eating");
    }
    public void sleep(){
        System.out.println("I'm Sleeping");
    }

}
