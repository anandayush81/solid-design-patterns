package lldprac.structuralDesPat.adapterv2RequestObj;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {
    private Long id;
    private String name, email;
    private Double amount;
}
