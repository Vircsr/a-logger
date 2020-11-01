package log;

/**
 * 文件记录
 * create by chen on 2020/11/1
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void writeLog(int level, String message) {
        System.out.println("file");
    }
}
