public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(1000.00);
        stockMarket.setPrice(2000.50);

        stockMarket.removeObserver(mobileApp);

        stockMarket.setPrice(1500.50);
    }
}
