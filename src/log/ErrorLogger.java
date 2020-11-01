package log;

/**
 * 错误记录
 * create by chen on 2020/11/1
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void writeLog(int level, String message) {

        System.out.println("this is a error log");
    }
}
