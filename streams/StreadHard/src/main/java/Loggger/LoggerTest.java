package Loggger;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

//class Logger {
//
//    private static volatile Logger instance;
//    private FileWriter writer;
//
//    private Logger() {
//        try {
//            writer = new FileWriter("app.log", true); // append mode
//        } catch (IOException e) {
//            throw new RuntimeException("Could not create log file");
//        }
//    }
//
//    public static Logger getInstance() {
//        if (instance == null) {
//            synchronized (Logger.class) {
//                if (instance == null) {
//                    instance = new Logger();
//                }
//            }
//        }
//        return instance;
//    }
//
//    // Thread-safe method
//    public synchronized void log(String level, String msg) {
//        try {
//            writer.write(LocalDateTime.now() + " [" + level + "] " + msg + "\n");
//            writer.flush();
//        } catch (IOException e) {
//            System.out.println("Logging failed: " + e.getMessage());
//        }
//    }
//
//    public void info(String msg) {
//        log("INFO", msg);
//    }
//    public void error(String msg) {
//        log("ERROR", msg);
//    }
//    public void debug(String msg) {
//        log("DEBUG", msg);
//    }
//}
//
//
//public class LoggerTest {
//    public static void main(String[] args) {
//
//        Logger logger = Logger.getInstance();
//
//        logger.info("Application started");
//        logger.debug("Debug point reached");
//        logger.error("Something went wrong!");
//
//        System.out.println("Logs written to app.log file");
//    }
//}

class Logger{
    public static volatile Logger instace;
    private FileWriter writer;
    private Logger(){
        try{
        writer = new FileWriter("all.log",true);

        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static Logger getInstace(){
        if(instace==null){
            synchronized (Logger.class){
                if(instace==null) {
                    instace = new Logger();
                }
            }
        }
        return instace;
    }
    public synchronized void log(String message, String level){
        try {
            writer.write(level+" "+ message);
            writer.flush();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }


    }
    public void info(String s){
        log(s,"INFO");
    }


        }
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstace();

        logger.info("jskdjs");
    }
}