package designpattern.strategy;

public class SearchProgram {

    private SearchButton searchButton = new SearchButton();

    public void setModeAll() {
        searchButton.setSearchStrategy(new SearchStrategyAll());
    }

    public void setModeImage() {
        searchButton.setSearchStrategy(new SearchStrategyImage());
    }

    public void setModeNews() {
        searchButton.setSearchStrategy(new SearchStrategyNews());
    }

    public void setModeMap() {
        searchButton.setSearchStrategy(new SearchStrategyMap());
    }

    public void search() {
        searchButton.onClick();
        setModeImage();
        searchButton.onClick();
        setModeMap();
        searchButton.onClick();
        setModeNews();
        searchButton.onClick();
    }
}
