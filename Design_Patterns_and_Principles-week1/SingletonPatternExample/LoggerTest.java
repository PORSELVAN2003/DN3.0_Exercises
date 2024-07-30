public class LoggerTest {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log");
        logger2.log("Second log");

        if (logger1 == logger2) {
            System.out.println("Logger1 and logger2 are same instance.");
        } else {
            System.out.println("Logger1 and logger2 are different instances.");
        }
    }
}
