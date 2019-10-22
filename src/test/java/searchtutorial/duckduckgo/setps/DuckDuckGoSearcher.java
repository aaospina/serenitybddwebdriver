package searchtutorial.duckduckgo.setps;

import net.thucydides.core.annotations.Step;
import searchtutorial.duckduckgo.pageObjects.DuckDuckGoSearchPage;

public class DuckDuckGoSearcher {

    DuckDuckGoSearchPage searchPage;

    @Step
    public void searches_by_keyword_for(String keyword) {
        searchPage.enterSearchTerms(keyword);
        searchPage.submitSearch();
    }

    @Step
    public void should_see_only_results_contaning(String expectedTerms) {
    }
}
