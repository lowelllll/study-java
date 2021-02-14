package designpattern.singleton;

public class FirstPage {
    private Settings settings = Settings.getSettings();

    public void setAndPrintSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(13);

        System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
    }
}
