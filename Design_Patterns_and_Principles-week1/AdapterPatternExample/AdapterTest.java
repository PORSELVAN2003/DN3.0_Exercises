public class AdapterTest {
    public static void main(String[] args) {

        ThirdPartyGatewayA gatewayA = new ThirdPartyGatewayA();
        ThirdPartyGatewayB gatewayB = new ThirdPartyGatewayB();

        PaymentProcessor adapterA = new GatewayAAdapter(gatewayA);
        PaymentProcessor adapterB = new GatewayBAdapter(gatewayB);

        adapterA.processPayment(1000.50);
        adapterB.processPayment(5000.00);

    }
}
