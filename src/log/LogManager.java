package log;

/**
 * 日志管理器
 * create by chen on 2020/11/1
 */
public class LogManager {
    private static class LogManagerHolder{
        private static LogManager instance = new LogManager();
    }
    private AbstractLogger logger;
    private LogManager(){
        AbstractLogger errorLogger = new ErrorLogger(LogLevel.ERROR.getLevel());
        AbstractLogger fileLogger = new FileLogger(LogLevel.DEBUG.getLevel());
        AbstractLogger consoleLogger = new ConsoleLogger(LogLevel.INFO.getLevel());

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        this.logger = errorLogger;
    }

    public static LogManager getInstance(LogLevel logLevel, String message) {
        LogManager manager = LogManagerHolder.instance;
        manager.logger.logMessage(logLevel.getLevel(), message);
        return manager;
    }
}
