package lldprac.structuralDesPat.facade.wFacade;
import java.util.NoSuchElementException;

public class OrderManagerImpl implements OrderManager {
    private OrderProcessor orderProcessor = new OrderProcessorImpl();
    @Override
    public void checkout(Long orderId) {
        orderProcessor.process(orderId);
    }
}

//What we've done is just added a wrapper/ one extra layer of OrderManager above OrderProcessor
//and provided an entry point to OrderProcessor from OrderManager.
//Here OrderManager is the facade and OrderProcessor does the actual job

//Here the checkout() method is not reusable but the process() method is. Bcoz the checkout() method may have
//some other business logic which is not related to actual processing of order.



/*
eg:
public void checkout(Long orderId, String source) {
    if(source.equals("Flipkart")){
            //Give some sales discount
        }
            //Some frontend validations
            //Some transformations
        orderProcessor.process(orderId);
}*/
