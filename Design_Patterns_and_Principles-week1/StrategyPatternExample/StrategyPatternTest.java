public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9999-1234", "SAM"));
        context.executePayment(250.75);

        context.setPaymentStrategy(new PayPalPayment("SAM@ICIC.COM"));
        context.executePayment(120.00);
    }
}
