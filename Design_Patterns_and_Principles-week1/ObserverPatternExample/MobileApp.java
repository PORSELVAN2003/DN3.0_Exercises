public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    public void update(double price) {
        System.out.println(name + ": updated stock price : Rs. " + price);
    }
}
