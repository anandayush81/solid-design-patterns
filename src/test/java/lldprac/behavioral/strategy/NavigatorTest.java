package lldprac.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class NavigatorTest {
    @Test
    public void testBullet(){
        NavigationStrategy strategy=new TwoWheelerStrategy();
        Navigator navigator=new Navigator(strategy); //Dependency Injection
        System.out.println(navigator.navigate("Gopalan", "Phoenix"));

        NavigationStrategy fourWheeler=new FourWheelerStrategy();
        navigator.setNavigationStrategy(fourWheeler);
        System.out.println(navigator.navigate("Gopalan", "Phoenix"));

    }
}
