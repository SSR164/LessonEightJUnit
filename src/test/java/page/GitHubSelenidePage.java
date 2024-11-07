package page;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GitHubSelenidePage {
    private SelenideElement wikiTabInput =$("#wiki-tab");
    private SelenideElement showPage=$(".Box-row.wiki-more-pages-link").$("button");
    private SelenideElement wikiRightbarInput=$(".wiki-rightbar");
    private SelenideElement wikiFilter=$("#wiki-pages-filter");
    private SelenideElement wikiFilterElement=$(".wiki-rightbar");
    private SelenideElement pageElement=$("#wiki-wrapper");

    public GitHubSelenidePage openPage() {
        open("/selenide/selenide");
        return this;
    }
    public GitHubSelenidePage clickWikiTеa() {
        wikiTabInput.click();
        return this;

    }
    public GitHubSelenidePage openShowPage() {
        showPage.$("button").click();
        return this;
    }
    public GitHubSelenidePage checkWikiRightbar(String string) {
        wikiRightbarInput.shouldHave(text(string));
        return this;
    }
    public GitHubSelenidePage clickWikiRightbar(String string) {
        wikiRightbarInput.shouldHave(text(string)).click();
        return this;
    }
    public GitHubSelenidePage writeWikiFilter(String string) {
        wikiFilter.setValue(string);
        return this;
    }
    public GitHubSelenidePage clickWikiElement(String string) {
        wikiFilterElement.$(byText(string)).click();
        return this;
    }
    public GitHubSelenidePage checkPageElement(String string) {
        pageElement.shouldHave(text(string));
        return this;
    }
}
