package SingletonPattern;

class Logger {
     private static Logger instance;
     private Logger() {
         System.out.println("Logger Initialization");
     }
     public static Logger getInstance() {
         if(instance == null) {
             instance = new Logger();
         }
         return instance;
     }
     public void info(String message) {
         System.out.println("[INFO] : " + message);
     }
     public void error(String message) {
         System.out.println("[ERROR] : " + message);
     }
     public void warning(String message) {
         System.out.println("[WARNING] : " + message);
     }
}
