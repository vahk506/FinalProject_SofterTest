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
public class MenPage {

    private WebDriver driver;
    WebDriverWait wait;
    /** Constructor*/
    public MenPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    /** Method to see all Man clothes*/
    public MenPage clickOnViewAll() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.VIEW_ALL)).click();
        return this;
    }
    /** Click on the first Product that appears */
    public ProductPage clickOnProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT));
        driver.findElement(Locators.PRODUCT).click();
        return new ProductPage(driver);
    }

    /** A method to check whether the search gave a result*/
    public String successfulSearch() {
        WebElement searchText = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SEARCH_RESULT));
        boolean isDisplayed = searchText.isDisplayed();

        if (isDisplayed) {
            return "We have products under that ID";
        } else {
            return "We have found 0 products";
        }
    }

    /** Method to click on the filter lowest-to-highest prices*/
    public MenPage clickOnFilterLtoH(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOWEST_TO_HIGHEST)).click();
        return this;
    }
    /** Checks whether the products are put from lowest to highest */
    public String checkThePrices(){
        List<WebElement> priceElements = driver.findElements(Locators.SIMILAR_PRODUCTS);
        List<Double> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            prices.add(Double.parseDouble(priceText));
        }

        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);
        if (prices.equals(sortedPrices)) {
            return "Prices are sorted from lowest to highest.";
        } else {
            return "Prices are not sorted from lowest to highest.";
        }
    }
    //--------
    /**  Method to click on Quick Shop button*/
    public MenPage clickOnQuickShop(){
        var actions = new Actions(driver);
        WebElement figure1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT));
        actions.moveToElement(figure1).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.QUICK_ADD)).click();
        return this;
    }
    /** Method to click on size drop down*/
    public MenPage clickOnSizeDropDown1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE_DROPDOWN_MENU_FOR_2nd)).click();
        return this;
    }
    /** Method to chose on size*/
    public MenPage clickOnSize2(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE2)).click();
        return this;
    }
    /** Method to Add the product to the bag*/
    public MenPage clickOnAddToBag2(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_TO_BAG)).click();
        return this;
    }
    /** Checks whether the product has been added to the bag*/
    public String successText() {
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_TO_CART_SUCCESS_TEXT2)).getText();
    }

}

