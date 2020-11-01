package log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * 命令行记录
 * create by chen on 2020/11/1
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void writeLog(int level, String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(LogLevel.getNameByValue(level) + " " + message + " " + sdf.format(date));
    }
}
