package lldprac.behavioral.strategy;

//Step 3 - Adding reference to context class
public class Navigator {
    private NavigationStrategy navigationStrategy; //Correct: Loose Coupling
    //private TwoWheelerStrategy navigationStrategy; //Wrong : Tight Coupling
    /*public Navigator(TwoWheelerStrategy strategy) {
        this.navigationStrategy=strategy;
    }*/

    //Constructor
    public Navigator(NavigationStrategy navigationStrategy) {
        this.navigationStrategy=navigationStrategy;
    }

    //Setter
    public void setNavigationStrategy(NavigationStrategy navigationStrategy){
        this.navigationStrategy=navigationStrategy;
    }



    //Pass through method; does nothing; passes through to strategy
    //This navigate method has no relation with navigate methode in Interface, it's name can be anything
    public Double navigate(String from, String to){
        return navigationStrategy.navigate(from, to);
    }
}
