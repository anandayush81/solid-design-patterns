package lldprac.behavioral.observer;
//Step 2
//BitcoinManager is in a way, our concrete class that does the publishing

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BitcoinManager extends Publisher {

    private Bitcoin bitcoin;
    public void setPrice(Double price){

        if(bitcoin.getPrice()-price>5.0){
            //super.publish(price) this can also be written
            publish(price); //when we call publish method, it notifies all our consumers
            //Since we're extending the Publisher class, we can directly call parent class methods from child class

        }
        bitcoin.setPrice(price);

    }
}
