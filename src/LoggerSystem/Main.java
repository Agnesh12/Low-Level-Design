package LoggerSystem;

public class Main {
    public static void main(String[] args) {
        Logger console = new ConsoleLogger();
        LoggerService service1 = new LoggerService(console);
        Logger file = new FileLogger();
        LoggerService service2 = new LoggerService(file);
        Logger data = new DatabaseLogger();
        LoggerService service3 = new LoggerService(data);
        service1.ConsoleNotification("Console Message");
        service2.ConsoleNotification("File Message");
        service3.ConsoleNotification("Database Message");


    }
}
