package searchtutorial.duckduckgo.setps;

import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.hamcrest.Matchers;
import searchtutorial.duckduckgo.pageObjects.DUckDuckGoResultPage;
import searchtutorial.duckduckgo.pageObjects.DuckDuckGoSearchPage;

import java.util.List;

public class DuckDuckGoSearcher {

    private String actor;

    DuckDuckGoSearchPage searchPage;
    DUckDuckGoResultPage resultPage;

    @Step("#actor searches for things related to {0}")
    public void searches_by_keyword_for(String keyword) {
        searchPage.enterSearchTerms(keyword);
        searchPage.submitSearch();
    }

    @Step("#actor should see only results containing the words {0}")
    public void should_see_only_results_contaning(String expectedTerms) {
        List<String> results = resultPage.getDisplayedResults();

        assertThat(results, Matchers.everyItem(containsString(expectedTerms)));
    }

    @Step("#actor starts on the DuckDuckGo home page")
    public void is_on_the_duckduckgo_homepage() {
        searchPage.open();
    }
}
