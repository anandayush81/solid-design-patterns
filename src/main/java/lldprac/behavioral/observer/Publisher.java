package lldprac.behavioral.observer;

//step-1 - create interface for publisher and registry
//Through registry, we can have a set of consumers that we can add or remove based on our need

import java.util.ArrayList;
import java.util.List;

//Although none of the methods are abstract in this class, still this class is abstract
// because we will never create an object of this class
//Instead we'll just extend this Publisher class in our BitcoinManager class
public abstract class Publisher {
    private List<Consumer> consumers=new ArrayList<>();
    public void publish(Double price){
        /*for(Consumer consumer:consumers){
            consumer.consume(price);
        }*/
        consumers.forEach(consumer -> consumer.consume(price));
    }
    public void addConsumer(Consumer consumer){
        consumers.add(consumer);
    }
    public void removeConsumer(Consumer consumer){
        consumers.remove(consumer);
    }
}
