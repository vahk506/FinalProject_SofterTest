import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Class for Product Page
 * */
public class ProductPage {

    private WebDriver driver;
    WebDriverWait wait;
    /** Constructor */
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    /** Method to click on size drop down*/
    public ProductPage clickOnSizeDropDown1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE_DROPDOWN_MENU)).click();
        return this;
    }
    /** Method to choose the size for the product*/
    public ProductPage clickOnSize1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE1));
        driver.findElement(Locators.SIZE1).click();
        return this;
    }

    /** Method to add to Cart*/
    public ProductPage addToCart1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_TO_CART)).click();
        return this;
    }
    /** Checks whether the product has been added to the cart*/
    public String successText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_TO_CART_SUCCESS_TEXT)).getText();
    }

    // ---- methods for ZipCode Test

    /** Method to add ZipCode in "Zipcode" field*/
    public ProductPage addZipCode(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ZipCode)).sendKeys("12345");
        return this;
    }
    /** Method to navigate to search*/
    public ProductPage clickOnSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_BUTTON_FOR_ZIPCODE)).click();
        return this;
    }
    /** Method to get the Address Information*/
    public String addressInfo(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ZipCode_ADDRESS)).getText();
    }
    //-------SizeDetailsTest----
    /** Method to click on Size Details*/
    public ProductPage clickOnSizeDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE_DETAILS)).click();
        return this;
    }
    /** Click on How to Measure section*/
    public ProductPage clickOnHowToMeasure(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.HOW_TO_MEASURE)).click();
        return this;
    }
    /** Method to check whether the chart is displayed */
    public boolean isChartDisplayed(){
        WebElement chart = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CHART));
        return chart.isDisplayed();
    }

    /** Method to navigate to Bag Page*/
    public BagPage clickOnBag(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.BAG)).click();
        return new BagPage(driver);
    }


}
