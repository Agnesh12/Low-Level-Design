package SingletonPattern;

public class LoggerSystem {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println(logger1 == logger2);
        logger1.info("Logger Information");
        logger1.error("Logger Error Spotted");
        logger2.warning(" Logger Waring Spotted");

    }
}
