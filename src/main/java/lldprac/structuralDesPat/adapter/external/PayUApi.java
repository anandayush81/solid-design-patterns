package lldprac.structuralDesPat.adapter.external;
//STep -0
//These are SDKs
public class PayUApi {
    public void makePayment(Long id, Double amount ){
        System.out.println("PayU Payment");
    }
    public PayUStatus getStatus(Long id){
        return PayUStatus.SUCCESS;
    }
}
