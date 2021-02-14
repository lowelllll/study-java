package designpattern.singleton;

public class Settings {

    private boolean darkMode = false;
    private int fontSize = 13;

    private Settings() {
    }

    public static Settings getInstance() {
        return InnerClass.settings;
    }

    public boolean getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean _darkMode) {
        darkMode = _darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int _fontSize) {
        fontSize = _fontSize;
    }

    private static class InnerClass {
        private static final Settings settings = new Settings();
        // 멀티쓰레드에 안전, lazy loading 지원, serialization에도 안전한 싱글톤
    }
}
