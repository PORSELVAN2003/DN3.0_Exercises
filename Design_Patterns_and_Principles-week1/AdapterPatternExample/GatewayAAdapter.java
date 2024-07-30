public class GatewayAAdapter implements PaymentProcessor {
    private ThirdPartyGatewayA gatewayA;

    public GatewayAAdapter(ThirdPartyGatewayA gatewayA) {
        this.gatewayA = gatewayA;
    }
    
    public void processPayment(double amount) {
        gatewayA.makePayment(amount);
    }
}
