package lldprac.creational.factory.factoryMethod;

// Step 2 - Create the concrete product classes
public class RoundButton extends Button {
    private Double radius;

    public RoundButton(Double border, Double radius) {
        super(border);
        this.radius=radius;
    }

    //    private Double border;
    public void onClick(){
        System.out.println("Round Button was clicked");
    }
    public void render(){
        System.out.println("Rendered!");
    }
}
