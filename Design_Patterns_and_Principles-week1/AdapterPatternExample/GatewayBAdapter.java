public class GatewayBAdapter implements PaymentProcessor {
    private ThirdPartyGatewayB gatewayB;

    public GatewayBAdapter(ThirdPartyGatewayB gatewayB) {
        this.gatewayB = gatewayB;
    }

    public void processPayment(double amount) {
        gatewayB.executePayment(amount);
    }
}
