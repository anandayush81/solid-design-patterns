package lldprac.structuralDesPat.adapterv2RequestObject;

import lldprac.structuralDesPat.adapterv2RequestObj.PaymentProvider;
import lldprac.structuralDesPat.adapterv2RequestObj.PaymentRequest;
import lldprac.structuralDesPat.adapterv2RequestObj.PaymentStatus;
import lldprac.structuralDesPat.adapterv2RequestObj.RazorPayAdapter;
import org.junit.jupiter.api.Test;

public class PaymentProviderTest {
    PaymentProvider adapter =new RazorPayAdapter();
    //To control parameter explosion, we can use Builder pattern
    @Test
    public void testPayMethod(){
        adapter.createPayment(PaymentRequest.builder()
                        .id(1L)
                        .name("Ayush")
                        .email("ayushan@s.com")
                        .amount(500.0)
                        .build());
        PaymentStatus status= adapter.verifyStatus(1L);
        System.out.println("Status is "+ status);
    }
}
