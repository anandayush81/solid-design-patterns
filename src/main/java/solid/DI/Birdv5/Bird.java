package solid.DI.Birdv5;

import lombok.AllArgsConstructor;

//Common method and common attributes of all child classes of bird class can stay here.
//Child class specific implementation will move to child class. Eg- fly()
@AllArgsConstructor
public abstract class Bird {

    private String name;
    private Double weight;
    private BirdType type;
    private Color color;
    private Size size;
    //Here in the Bird class, we have specified StrongBeak, which is wrong
    //Not every bird will have a strong beak, some may have weak bea as well.
    //So we need to specify Beak, not it's child class

//    private StrongBeak beak;


    private Beak beak;


    public void eat(){
        System.out.println("I'm Eating");
    }
    public void sleep(){
        System.out.println("I'm Sleeping");
    }

}
