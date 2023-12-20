package lldprac.behavioral.strategy;

public class TwoWheelerStrategy implements NavigationStrategy{
    @Override
    public Double navigate(String from, String to) {
        return 2.0;
    }
}
