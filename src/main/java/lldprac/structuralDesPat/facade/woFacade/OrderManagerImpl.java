package lldprac.structuralDesPat.facade.woFacade;


import java.util.NoSuchElementException;

public class OrderManagerImpl implements OrderManager {
    private InventoryService inventoryService=new InventoryService();
    private PaymentService paymentService=new PaymentService();
    private InvoiceService invoiceService=new InvoiceService();

    @Override
    public void checkout(Long OrderId) {

        //check inventory
        if(!inventoryService.isPresent(OrderId)){
            throw new NoSuchElementException("Stock is Empty");
        }

        //payment gateway
        paymentService.processPayment(OrderId);

        //create Invoice
        invoiceService.printInvoice(OrderId);

        //This class is getting larger and larger
        //If we had to implement more functionalities, like update inventory, send email, schedule deliver
        //It would become god class. Not to mention, SRP is already violated

        //Here the checkout() method is not reusable. If we want to reuse this checkout method from some other class
        //It may not be very reusable coz it does 100 different things

        //So what we'll do is take all these classes and put it in a separate class
        //Here checkout() is a complex subsystem. So we need to put this is another class



    }
}
