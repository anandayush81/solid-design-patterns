package lldprac.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BitcoinTest {
    //when we write multiple unit test cases, the must be independent of each other
    //SetUp = Create dependency before each test case
    //TearDown = Destroy the dependency

    private BitcoinManager bitcoinManager;

    @BeforeEach
    public void setUp(){
        Bitcoin bitcoin=new Bitcoin(100.0);
        bitcoinManager=new BitcoinManager(bitcoin);
        //Now we have created a bitcoinManager, which is a Publisher, we need to add the consumers, who will consume
        //the information from this Publisher
        //We can have different consumers for different cases
        //Like for BitCoin we have Email and SMS
        //For Ethereum, we might have Slack and Tweet

        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer((new SMSConsumer()));
    }
    @Test
    public void updatePrice(){
        bitcoinManager.setPrice(90.0);
    }

    /*@Test
    public void test(){
        Bitcoin bitcoin=new Bitcoin(100.0);
        BitcoinManager bitcoinManager=new BitcoinManager(bitcoin);
        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer((new SMSConsumer()));
        bitcoinManager.setPrice(90.0);
    }*/
}
