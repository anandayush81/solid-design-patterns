package lldprac.behavioral.observer;

public class SMSConsumer implements Consumer{
    @Override
    public void consume(Double price) {
        System.out.println("Sending SMS with the price "+price);
    }
}
