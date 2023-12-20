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
    public Double navigate(String from, String to){
        return navigationStrategy.navigate(from, to);
    }
}
