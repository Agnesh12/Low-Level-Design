package LoggerSystem;

class LoggerService {
    private Logger logger;

    public LoggerService(Logger logger) {
        this.logger = logger;
    }
    public void ConsoleNotification(String Message) {
        logger.loggerMsg(Message);
    }
}
