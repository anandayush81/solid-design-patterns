package lldprac.behavioral.observer;

public class EmailConsumer implements Consumer{
    @Override
    public void consume(Double price) {
        System.out.println(" Sending email with price "+price);
    }
}
