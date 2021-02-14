package designpattern.singleton;

public class SecondPage {
    private Settings settings = Settings.getInstance();

    public void printSettings() {
        System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
    }
}

