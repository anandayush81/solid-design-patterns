package lldprac.structuralDesPat.adapter;

import lldprac.structuralDesPat.adapter.external.PayUApi;
import lldprac.structuralDesPat.adapter.external.PayUStatus;
import lldprac.structuralDesPat.adapter.external.RazorPayApi;
import lldprac.structuralDesPat.adapter.external.RazorPayStatus;
import org.junit.jupiter.api.Test;

public class PaymentProviderTest {
    @Test
    public void testPayMethod(){
        /* If we did not use Adapter design pat, we'd have to test like this
        if(paymentGateway=="RazorPay"){
            RazorPayApi.pay();
            RazorPayStatus status=RazorPayStatus.OK;
        }
        else{
            PayUApi.makePayment();
            PayUStatus staus=PayUStatus.SUCCESS;
        }
        */

//        PaymentProvider adapter1=new RazorPayAdapter();
//        adapter1.createPayment(1L, "Ayush", "ayushan@s.com", 100.0);

        //Now to pay through PayU API, don't need to change any code/method call.
        //Just need to change my adapter

        PaymentProvider adapter2=new PayUAdapter();
        adapter2.createPayment(2L, "AyushAnand", "ayushan@synop.com", 200.0);
    }
    @Test
    public void testStatus(){
        PaymentProvider adapter1=new RazorPayAdapter();
        PaymentStatus status=adapter1.verifyStatus(1L);
        System.out.println(status);

        PaymentProvider adapter2=new RazorPayAdapter();
        PaymentStatus status2=adapter2.verifyStatus(2L);
        System.out.println(status);
    }


}
