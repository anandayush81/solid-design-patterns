package lldprac.factory.abstractFactory;

// Step 2 - Create the concrete product classes
public class LightButton extends Button {
    private Double length;

    public LightButton(Double border, Double length) {
        super(border);
        this.length=length;
    }
//    private Double border;

    public void onClick(){
        System.out.println("Square Button was clicked");
    }
    public void render(){
        System.out.println("Rendered!");
    }
}
