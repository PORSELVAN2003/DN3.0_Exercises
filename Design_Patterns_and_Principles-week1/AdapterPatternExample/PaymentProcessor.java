public interface PaymentProcessor {
    void processPayment(double amount);
}

class ThirdPartyGatewayA {
    public void makePayment(double amount) {
        System.out.println("Processing payment with Third Party Gateway A : Rs. " + amount);
    }
}

class ThirdPartyGatewayB {
    public void executePayment(double amount) {
        System.out.println("Processing payment with Third Party Gateway B : Rs. " + amount);
    }
}
