import Locators.LocatorsForProductPage;
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
    public void clickOnSizeDropDown1() {
        driver.findElement(LocatorsForProductPage.SIZE_DROPDOWN_MENU).click();
    }
    /** Method to choose the size for the product*/
    public void clickOnSize1() {
        driver.findElement(Locators.LocatorsForProductPage.SIZE1).click();
    }

    /** Method to add to Cart*/
    public void addToCart1() {
        driver.findElement(LocatorsForProductPage.ADD_TO_CART).click();
    }
    /** Checks whether the product has been added to the cart*/
    public String successText() {
        return driver.findElement(LocatorsForProductPage.ADD_TO_CART_SUCCESS_TEXT).getText();
    }

    // ---- methods for ZipCode Test

    /** Method to add ZipCode in "Zipcode" field*/
    public void addZipCode(){
        driver.findElement(Locators.LocatorsForProductPage.ZipCode).sendKeys("12345");
    }
    /** Method to navigate to search*/
    public void clickOnSearch() {
        driver.findElement(LocatorsForProductPage.SEARCH_BUTTON_FOR_ZIPCODE).click();
    }
    /** Method to get the Address Information*/
    public String addressInfo(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorsForProductPage.ZipCode_ADDRESS)).getText();
    }
    //-------SizeDetailsTest----
    /** Method to click on Size Details*/
    public void clickOnSizeDetails(){
        driver.findElement(LocatorsForProductPage.SIZE_DETAILS).click();
    }
    /** Click on How to Measure section*/
    public void clickOnHowToMeasure(){
        driver.findElement(LocatorsForProductPage.HOW_TO_MEASURE).click();

    }
    /** Method to check whether the chart is displayed */
    public boolean isChartDisplayed(){
        WebElement chart = driver.findElement(LocatorsForProductPage.CHART);
        return chart.isDisplayed();
    }

    /** Method to navigate to Bag Page*/
    public BagPage clickOnBag(){
        driver.findElement(LocatorsForProductPage.BAG).click();
        return new BagPage(driver);
    }

}
