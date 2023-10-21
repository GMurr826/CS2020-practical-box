package calculator;

public interface VersionInfo {
    void printVersion();

    default String getAuthorInfo() {
        return "No author data available";
    }
}