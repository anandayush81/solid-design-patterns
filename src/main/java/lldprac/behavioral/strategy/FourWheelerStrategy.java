package lldprac.behavioral.strategy;

public class FourWheelerStrategy implements NavigationStrategy{
    @Override
    public Double navigate(String from, String to) {
        return 4.0;
    }
}
