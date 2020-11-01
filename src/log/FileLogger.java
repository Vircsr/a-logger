package log;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件记录
 * create by chen on 2020/11/1
 */
public class FileLogger extends AbstractLogger {
    private File logFile;

    public FileLogger(int level) {
        super(level);
        this.logFile = new File("log.txt");
    }

    @Override
    protected void writeLog(int level, String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = new Date();
        try {
            FileWriter writer = new FileWriter(logFile,true);
            BufferedWriter output = new BufferedWriter(writer);
            output.write(LogLevel.getNameByValue(level) + " " + message + " " + sdf.format(date) + "\n");
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file");
    }

    public File getLogFile() {
        return logFile;
    }

    public void setLogFile(File logFile) {
        this.logFile = logFile;
    }
}
