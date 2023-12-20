package lldprac.structuralDesPat.adapter.external;

public class RazorPayApi {
    public void prePay(Long id){
        System.out.println("Setting up RazorPay Pre Pay");
    }
    public void pay(Long id, String name, String email, Double amount ){
        System.out.println("Razor Pay Payment");
    }
    public RazorPayStatus checkStatus(Long id){
        return RazorPayStatus.OK;
    }
}
