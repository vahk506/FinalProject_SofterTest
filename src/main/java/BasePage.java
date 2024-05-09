import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/**
 * Class for Base Page
 * */
public class BasePage {
    private final WebDriver driver;
    WebDriverWait wait ;

    /** Constructor*/
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    /** Method to accept Privacy Modal*/
    public BasePage acceptPrivacyModal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRIVACY_MODAL));
        driver.findElement(Locators.PRIVACY_MODAL).click();
        return this;
    }
    /** Method to close Ad Mark*/
    public BasePage closeAdMark(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.AD_MARK));
        driver.findElement(Locators.AD_MARK).click();
        return this;
    }
    /** Method to Hover on Man-dropDown*/
    public MenPage hoverOnMenPageDropdown() throws InterruptedException {
        var actions = new Actions(driver);
        WebElement figure1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LINK_TO_MEN_PAGE));
        actions.moveToElement(figure1).perform();
        return new MenPage(driver);
    }

    //-----------------
    /** Method to navigate to Search part */
    public BasePage clickOnSearchSign(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_SIGN)).click();
        return this;
    }
    /** Method to add text in Search Bar*/
    public BasePage addTextSearch(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_TEXT_BOX)).sendKeys(text);
        return this;
    }
    /** Method to empty add text in Search Bar*/
    public BasePage addEmptyTextSearch(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_TEXT_BOX)).sendKeys(" ");
        return this;
    }
    /** Method to perform a search*/
    public MenPage clickOnSearchButton(){
        driver.findElement(Locators.Search_BTN).click();
        return new MenPage(driver);
    }

    public boolean isAdDisplayed(){
        WebElement AD = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.AD_MARK));
        return AD.isDisplayed();
    }

}
