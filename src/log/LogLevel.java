package log;

public enum LogLevel {
    INFO("info"), DEBUG("debug"), WARNING("warning"), ERROR("error");
    private String info;
    private LogLevel(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
