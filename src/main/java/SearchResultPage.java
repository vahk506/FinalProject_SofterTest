import Locators.LocatorsForMenPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/** Class for Men Page*/
public class SearchResultPage {

    private final WebDriver driver;
    WebDriverWait wait;
    /** Constructor*/
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /** A method to check whether the search gave a result*/
    public String successfulSearch() {
        WebElement searchText = driver.findElement(LocatorsForMenPage.SEARCH_RESULT);
        boolean isDisplayed = searchText.isDisplayed();

        if (isDisplayed) {
            return "We have products under that ID/Key";
        } else {
            return "We have found 0 products";
        }
    }

    public Boolean FetchingTheSearchResult(String text){
        List<WebElement> results = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);
        boolean allResultsValid = true;

        for (WebElement result : results) {
            String resultText = result.getText().toLowerCase();
            if (!resultText.contains(text)) {
                allResultsValid = false;
                System.out.println("Found a result without the keyword: " + resultText);
                break;
            }
        }

        if (allResultsValid) {
            System.out.println("All " + results.size() + " search results correctly contain the keyword.");

        } else {
            System.out.println("Some search results do not contain the keyword.");
        }
        return allResultsValid;
    }

}

