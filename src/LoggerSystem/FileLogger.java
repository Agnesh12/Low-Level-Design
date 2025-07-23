package LoggerSystem;

class FileLogger implements Logger {
    public void loggerMsg(String Message) {
        System.out.println("It Will Print In :" + Message);
    }
}
