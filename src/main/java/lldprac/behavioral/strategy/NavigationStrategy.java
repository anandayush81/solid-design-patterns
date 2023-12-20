package lldprac.behavioral.strategy;

import java.util.List;

// Step 1 - Create the strategy interface
public interface NavigationStrategy {
    Double navigate(String from, String to);
}