package log;

/**
 * 抽象记录器
 *
 * @author Chen
 */
public abstract class AbstractLogger {
    protected int level;
    /**
     * 责任链下一元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            writeLog(level, message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void writeLog(int level, String message);
}
