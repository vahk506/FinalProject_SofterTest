import Locators.LocatorsForHomePage;
import Locators.LocatorsForMenPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Class for Base Page
 * */
public class HomePage {
    private final WebDriver driver;

    /** Constructor*/
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    /** Method to accept Privacy Modal*/
    public void acceptPrivacyModal() {
        driver.findElement(Locators.LocatorsForHomePage.PRIVACY_MODAL).click();
    }
    /** Method to close Ad Mark*/
    public void closeAdMark(){
        driver.findElement(Locators.LocatorsForHomePage.AD_MARK).click();
    }
    /** Method to Hover on Man-dropDown*/
    public MenPage hoverOnMenDropDown() {
        // Locate the element without explicitly waiting for it to become visible
        WebElement figure1 = driver.findElement(Locators.LocatorsForHomePage.LINK_TO_MEN_PAGE);

        // Use Actions class to perform hover action
        var actions = new Actions(driver);
        actions.moveToElement(figure1).perform();

        // Return a new instance of the MenPage class, assuming navigation to it is handled elsewhere or implicitly understood
        return new MenPage(driver);
    }

    //-----------------
    /** Method to navigate to Search part */
    public void clickOnSearchSign(){  //void
        driver.findElement(Locators.LocatorsForHomePage.SEARCH_SIGN).click();
    }
    /** Method to add text in Search Bar*/
    public void addTextSearch(String text){
        driver.findElement(Locators.LocatorsForHomePage.SEARCH_TEXT_BOX).sendKeys(text);

   }
    /** Method to empty add text in Search Bar*/
    public void addEmptyTextSearch(){
        driver.findElement(Locators.LocatorsForHomePage.SEARCH_TEXT_BOX).sendKeys(" ");
    }
    /** Method to perform a search*/
    public SearchResultPage clickOnSearchButton(){
        driver.findElement(Locators.LocatorsForHomePage.Search_BTN).click();
        return new SearchResultPage(driver);
    }

    /** Method to check if an ad is displayed */
    public boolean isAdDisplayed() {
        try {
            // Attempt to find the ad element and check if it's displayed
            return driver.findElement(LocatorsForHomePage.AD_MARK).isDisplayed();
        } catch (NoSuchElementException e) {
            // If the element is not found, return false
            return false;
        }
    }
    /** Helper method for Random Text*/
    private String randomText(int length){
             String CHAR_SET = "ABCDEFGHIJKLMNOPQщаргщաեֆիհքիֆRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%йцунгфыնահսսֆբի";

            Random random = new Random();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(CHAR_SET.length());
                sb.append(CHAR_SET.charAt(index));
            }

            return sb.toString();
        }
    /** Method to generate random text with the Length of "length"*/
    public void AddRandomText(int length){
        driver.findElement(Locators.LocatorsForHomePage.SEARCH_TEXT_BOX).sendKeys(randomText(length));
    }


}
