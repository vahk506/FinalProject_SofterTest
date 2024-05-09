import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Class For Bag Page.
 * */
public class BagPage {
    private WebDriver driver;
    WebDriverWait wait;
    /** Constructor */
    public BagPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    /** Method to navigate to edit window in Bag*/
    public BagPage clickOnEdit(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.EDIT)).click();
        return this;
    }
    /** Method to add Quantity of product*/
    public BagPage addQuantity(int n ){
        for (int i = 0; i < n; i++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_QUANTITY)).click();
        }
        return this;
    }
    /** Method to decrease the Quantity of product*/
    public BagPage decreaseQuantity(int n ){
        for (int i = 0; i < n; i++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.DECREASE_QUANTITY)).click();
        }
        return this;
    }
    /** Method to choose the Size*/
    public BagPage clickOnSize(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE3)).click();
        return this;
    }
    /** Action to click on Update Button*/
    public BagPage clickOnUpdate(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.UPDATE_THE_BAG)).click();
        return this;
    }
    /** click on Size Drop Down*/
    public BagPage clickOnSizeDropDown(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIZE_DROPDOWN_MENU_FOR_3nd)).click();
        return this;
    }
    /** Method to learn the quantity before the update*/
    public String quantityAfterUpdate() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.QUANTITY_AFTER_UPDATE)).getText();
    }
    /** Method to learn the quantity after the update*/
    public String quantityBeforeUpdate() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.QUANTITY_BEFORE_UPDATE)).getText();
    }

    /** Method to remove the product from the bag*/
    public BagPage clickOnRemoveProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.REMOVE_PRODUCT_FROM_BAG)).click();
        return this;
    }
    /**Method to check whether the Bag is empty or has a product in it */
    public String BagInfo(){
        return   wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.REMOVE_PRODUCT_FROM_BAG)).getText();
    }

    /** This method is for EditBagTest/DecreaseQuantity
     * Lets assume that the quantity of the product is 1, as a result we can't decrease the quantity value2 time as webpage doesn't allow,
     * also it doesn't possible to have -quantity. So this helps me to understand whether the quantity is 1 or not.
     * if it is one I will add the quantity, if it is less not equal to one then algorithm skips the addQuantity  method and jumps right to
     * decrease the quantity.
     * */
    public int QuantityInfo(){
        return  Integer.parseInt(wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.NUMBER_OF_PRODUCTS_TO_BE_ADDED_TO_BAG)).getText());
    }

}

