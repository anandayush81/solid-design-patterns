package lldprac.structuralDesPat.adapterv2RequestObj;

import lldprac.structuralDesPat.adapterv2RequestObj.external.PayUApi;
import lldprac.structuralDesPat.adapterv2RequestObj.external.PayUStatus;

import static lldprac.structuralDesPat.adapterv2RequestObj.PaymentStatus.DONE;
import static lldprac.structuralDesPat.adapterv2RequestObj.PaymentStatus.FAILED;

public class PayUAdapter implements PaymentProvider {
    private PayUApi payUApi=new PayUApi();

//    @Override
//    public void createPayment(Long id, String name, String email, Double amount) {
//        payUApi.makePayment(id,amount);
//    }


    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        payUApi.makePayment(paymentRequest.getId(),paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        PayUStatus status = payUApi.getStatus(id);
        return to(status);

    }
    private PaymentStatus to(PayUStatus status) {
        switch(status){
            case SUCCESS: return DONE;
            case FAILURE: return FAILED;
        }
        throw new IllegalArgumentException("Invalid Status "+ status);
    }
}
