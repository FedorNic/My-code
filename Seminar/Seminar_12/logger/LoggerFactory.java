package Seminar.Seminar_12.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
