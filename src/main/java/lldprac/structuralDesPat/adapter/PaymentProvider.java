package lldprac.structuralDesPat.adapter;

public interface PaymentProvider {
    //The parameter will contain all the arguments present in both RazorPay and PayU
    void createPayment(Long id, String name, String email, Double amount);
    PaymentStatus verifyStatus(Long id);

}
