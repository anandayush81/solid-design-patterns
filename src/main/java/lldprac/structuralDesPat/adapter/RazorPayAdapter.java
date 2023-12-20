package lldprac.structuralDesPat.adapter;

import lldprac.structuralDesPat.adapter.external.RazorPayApi;
import lldprac.structuralDesPat.adapter.external.RazorPayStatus;

import static lldprac.structuralDesPat.adapter.PaymentStatus.DONE;
import static lldprac.structuralDesPat.adapter.PaymentStatus.FAILED;



public class RazorPayAdapter implements PaymentProvider{
    private RazorPayApi razorPayApi=new RazorPayApi();
    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        razorPayApi.prePay(id);
        razorPayApi.pay(id,name,email,amount);

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
