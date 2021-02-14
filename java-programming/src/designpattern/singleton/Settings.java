package designpattern.singleton;

public class Settings {

    private static Settings settings = null;
    ;
    private boolean darkMode = false;
    private int fontSize = 13;

    private Settings() {
    }

    public static Settings getSettings() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
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
}
