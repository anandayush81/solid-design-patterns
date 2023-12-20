package lldprac.structuralDesPat.adapterv2RequestObj;

import lldprac.structuralDesPat.adapterv2RequestObj.external.RazorPayApi;
import lldprac.structuralDesPat.adapterv2RequestObj.external.RazorPayStatus;

import static lldprac.structuralDesPat.adapterv2RequestObj.PaymentStatus.DONE;
import static lldprac.structuralDesPat.adapterv2RequestObj.PaymentStatus.FAILED;



public class RazorPayAdapter implements PaymentProvider {
    private RazorPayApi razorPayApi=new RazorPayApi();
//    @Override
//    public void createPayment(Long id, String name, String email, Double amount) {
//        razorPayApi.prePay(id);
//        razorPayApi.pay(id,name,email,amount);
//
//    }


    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        razorPayApi.prePay(paymentRequest.getId());
        razorPayApi.pay(paymentRequest.getId(),
                        paymentRequest.getName(),
                        paymentRequest.getEmail(),
                        paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        RazorPayStatus status= razorPayApi.checkStatus(id);
        return to(status);
    }

    private PaymentStatus to(RazorPayStatus status) {
        switch(status){
            case OK:return DONE;
            case ERROR:return FAILED;

        }
        throw new IllegalArgumentException("Invalid Status "+ status);
    }
}
