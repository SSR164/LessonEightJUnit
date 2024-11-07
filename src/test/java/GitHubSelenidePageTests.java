import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import page.GitHubSelenidePage;
public class GitHubSelenidePageTests extends TestsBase {
    GitHubSelenidePage gitHubSelenidePage = new GitHubSelenidePage();



   @ValueSource(strings = {"Home","Quick Start"})
        @ParameterizedTest

        void checkGitHubValueSource(String string){
            gitHubSelenidePage.openPage();
            gitHubSelenidePage.clickWikiTеa();
            gitHubSelenidePage.checkWikiRightbar(string);



        }
    @CsvSource(value= {
            "Home, Welcome to the selenide wiki!",
            "Quick Start,How to start?"})
    @ParameterizedTest
    void checkGitHubCsvSource(String string,String stringOn){
        gitHubSelenidePage.openPage();
        gitHubSelenidePage.clickWikiTеa();
        gitHubSelenidePage.writeWikiFilter(string);
        gitHubSelenidePage.clickWikiElement(string);
        gitHubSelenidePage.checkPageElement(stringOn);

    }
    @CsvFileSource (resources = "checkGitHubCsvFileSource.csv")
    @ParameterizedTest
    void checkGitHubCsvFileSource(String string,String stringOn){
        gitHubSelenidePage.openPage();
        gitHubSelenidePage.clickWikiTеa();
        gitHubSelenidePage.writeWikiFilter(string);
        gitHubSelenidePage.clickWikiElement(string);
        gitHubSelenidePage.checkPageElement(stringOn);

    }


}
