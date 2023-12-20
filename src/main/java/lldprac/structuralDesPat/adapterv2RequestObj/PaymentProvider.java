package lldprac.structuralDesPat.adapterv2RequestObj;

public interface PaymentProvider {
    //The parameter will contain all the arguments present in bot RazorPay and PayU
    void createPayment(PaymentRequest paymentRequest);
    PaymentStatus verifyStatus(Long id);

}
