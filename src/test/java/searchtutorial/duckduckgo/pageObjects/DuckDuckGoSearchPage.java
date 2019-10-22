package searchtutorial.duckduckgo.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://duckduckgo.com")
public class DuckDuckGoSearchPage extends PageObject {

    @FindBy(id = "search_from_input_homepage")
    WebElementFacade searchField;

    @FindBy(id = "search_button_homepage")
    WebElementFacade searchButton;

    @Step
    public void enterSearchTerms(String keyword) {
        searchField.type(keyword);
    }

    @Step
    public void submitSearch() {
        searchButton.click();
    }
}