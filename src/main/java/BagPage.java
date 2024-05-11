import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;

/**
 * Class For Bag Page using implicit waits.
 */
public class BagPage {
    private WebDriver driver;

    /** Constructor */
    public BagPage(WebDriver driver) {
        this.driver = driver;
        // Setting the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /** Method to navigate to edit window in Bag */
    public void clickOnEdit(){
        driver.findElement(Locators.LocatorsForBagPage.EDIT).click();
    }

    /** Method to add Quantity of product */
    public void addQuantity(int n){
        for (int i = 0; i < n; i++) {
            driver.findElement(Locators.LocatorsForBagPage.ADD_QUANTITY).click();
        }
    }

    /** Method to decrease the Quantity of product */
    public BagPage decreaseQuantity(int n){
        for (int i = 0; i < n; i++) {
            driver.findElement(Locators.LocatorsForBagPage.DECREASE_QUANTITY).click();
        }
        return this;
    }



    /** Action to click on Update Button */
    public void clickOnUpdate(){
        driver.findElement(Locators.LocatorsForBagPage.UPDATE_THE_BAG).click();
    }

    /** Method to learn the quantity before the update */
    public String quantityAfterUpdate() {
        return driver.findElement(Locators.LocatorsForBagPage.QUANTITY_AFTER_UPDATE).getText();
    }

    /** Method to learn the quantity after the update */
    public String quantityBeforeUpdate() {
        return driver.findElement(Locators.LocatorsForBagPage.QUANTITY_BEFORE_UPDATE).getText();
    }

    /** Method to remove the product from the bag */
    public void clickOnRemoveProduct(){
        driver.findElement(Locators.LocatorsForBagPage.REMOVE_PRODUCT_FROM_BAG).click();
    }

    /** Method to check whether the Bag is empty or has a product in it */
    public String BagInfo(){
        return driver.findElement(Locators.LocatorsForBagPage.REMOVE_PRODUCT_FROM_BAG).getText();
    }

    /** This method checks the initial quantity of products */
    public int QuantityInfo(){
        return Integer.parseInt(driver.findElement(Locators.LocatorsForBagPage.NUMBER_OF_PRODUCTS_TO_BE_ADDED_TO_BAG).getText());
    }
}
