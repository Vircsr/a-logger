package log;

/**
 * 日志级别枚举类
 */
public enum LogLevel {
    INFO(1), DEBUG(2), WARNING(3), ERROR(4),FATAL(5);
    private int level;
    private LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public static String getNameByValue(int level){
        for (LogLevel logLevel:LogLevel.values()){
            if (level == logLevel.level){
                return logLevel.name();
            }
        }
        return null;
    }
}
