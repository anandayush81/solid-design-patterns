package lldprac.structuralDesPat.facade.wFacade;
import java.util.NoSuchElementException;
//This OrderProcessorImpl class is a Facade class
public class OrderProcessorImpl implements OrderProcessor{
    private InventoryService inventoryService=new InventoryService();
    private PaymentService paymentService=new PaymentService();
    private InvoiceService invoiceService=new InvoiceService();
    //This process() method is a subsystem
    @Override
    public void process(Long orderId) {
        //check inventory
        if(!inventoryService.isPresent(orderId)){
            throw new NoSuchElementException("Stock is Empty");
        }
        //payment gateway
        paymentService.processPayment(orderId);
        //create Invoice
        invoiceService.printInvoice(orderId);
    }
}
