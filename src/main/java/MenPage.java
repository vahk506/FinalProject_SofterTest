import Locators.LocatorsForMenPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/** Class for Men Page*/
public class MenPage {

    private WebDriver driver;
    WebDriverWait wait;

    /**
     * Constructor
     */
    public MenPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Method to see all Man clothes
     */
    public void clickOnViewAll() {
        driver.findElement(Locators.LocatorsForMenPage.VIEW_ALL).click();
    }

    /**
     * Click on the first Product that appears
     */
    public ProductPage clickOnProduct() {
        driver.findElement(Locators.LocatorsForMenPage.PRODUCT).click();
        return new ProductPage(driver);
    }

    /**
     * Method to click on the filter lowest-to-highest prices
     */
    public void clickOnFilterLtoH() {
        driver.findElement(Locators.LocatorsForMenPage.LOWEST_TO_HIGHEST).click();
    }

    /**
     * Method to click on the filter lowest-to-highest prices
     */
    public void clickOnFilterHtoL() {
        driver.findElement(LocatorsForMenPage.HIGHEST_TO_LOWEST).click();
    }

    /**
     * Checks whether the products are put from lowest to highest
     */
    public String checkThePricesLowestToHighest() {
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsForMenPage.SIMILAR_PRODUCTS));
        List<WebElement> priceElements = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);
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

    public String checkThePricesHighestToLowest() {
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsForMenPage.SIMILAR_PRODUCTS));
        List<WebElement> priceElements = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);
        List<Double> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            prices.add(Double.parseDouble(priceText));
        }

        List<Double> sortedPrices = new ArrayList<>(prices);
        // Sort the list in descending order
        Collections.sort(sortedPrices, Comparator.reverseOrder());

        // Check if the original list is equal to the sorted (in descending order) list
        if (prices.equals(sortedPrices)) {
            return "Prices are sorted from highest to lowest.";
        } else {
            return "Prices are not sorted from highest to lowest.";
        }
    }
    //--------

    /**
     * Method to click on Quick Shop button
     */
    public void clickOnQuickShop() {
        // Using implicit wait set on the WebDriver to wait for the product element to be present
        WebElement product = driver.findElement(Locators.LocatorsForMenPage.PRODUCT);

        // Perform hover action on the product element
        var actions = new Actions(driver);
        actions.moveToElement(product).perform();

        // Click on the quick add button assuming it becomes interactable once the product is hovered
        driver.findElement(Locators.LocatorsForMenPage.QUICK_ADD).click();
    }

    /**
     * Method to click on size drop down
     */
    public void clickOnSizeDropDown1() {
        driver.findElement(Locators.LocatorsForMenPage.SIZE_DROPDOWN_MENU_FOR_2nd).click();
    }

    /**
     * Method to choose the size
     */
    public void clickOnSize2() {
        driver.findElement(Locators.LocatorsForMenPage.SIZE2).click();
    }

    /**
     * Method to Add the product to the bag
     */
    public void clickOnAddToBag2() {
        driver.findElement(Locators.LocatorsForMenPage.ADD_TO_BAG).click();
    }

    /**
     * Checks whether the product has been added to the bag
     */
    public String successText() {
        return driver.findElement(Locators.LocatorsForMenPage.ADD_TO_CART_SUCCESS_TEXT2).getText();
    }

    public void clickOnPriceTab() {
        driver.findElement(LocatorsForMenPage.PRICE_TAB).click();
    }

    public void clickOnLessThan_$10() {
        driver.findElement(LocatorsForMenPage.LESS_THAN_$10).click();
    }

    public void clickOn$10_$25() {
        driver.findElement(LocatorsForMenPage.$10_$25).click();

    }

    public void clickOn$25_$50() {
        driver.findElement(LocatorsForMenPage.$25_$50).click();
    }

    public void clickOn$50_$75() {
        driver.findElement(LocatorsForMenPage.$50_$75).click();
    }

    public void clickOnOver_$75() {
        driver.findElement(LocatorsForMenPage.OVER_$75).click();
    }
    /** Method to test Price Functionality Less than $10*/
    public boolean testPriceFilterLessThanTen() {
        boolean allPricesUnderTen = true;
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsForMenPage.SIMILAR_PRODUCTS));
        List<WebElement> priceElements = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);        // Process to check if all product prices are under $10
        StringBuilder errorMessages = new StringBuilder();

        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            double price = Double.parseDouble(priceText); // Convert the string to a double
            if (price >= 10) {
                allPricesUnderTen = false; // Set the flag to false if any product price is not under $10
                errorMessages.append(String.format("Product priced at $%.2f found, which should not be under 'Less than $10' filter\n", price));
            }
            System.out.println("Price: " + price);
        }

        System.out.println(errorMessages);
            return allPricesUnderTen;
    }
    /** Method to test Price Functionality $10-$25*/
    public boolean testPriceFilterBetweenTenAndTwentyFive() {
        boolean allPricesUnderTen = true;
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsForMenPage.SIMILAR_PRODUCTS));
        List<WebElement> priceElements = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);        // Process to check if all product prices are under $10
        StringBuilder errorMessages = new StringBuilder();

        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            double price = Double.parseDouble(priceText); // Convert the string to a double
            if (price >= 25 || price <= 10) {
                allPricesUnderTen = false; // Set the flag to false if any product price is not under $10
                errorMessages.append(String.format("Product priced at $%.2f found, which should not be under 'Less than $10' filter\n", price));
            }
            System.out.println("Price: " + price);
        }

        System.out.println(errorMessages);
        return allPricesUnderTen;
    }
    /** Method to test Price Functionality $25-$50*/
    public boolean testPriceFilterBetweenTwentyFiveAndFifty() {
        boolean allPricesUnderTen = true;
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsForMenPage.SIMILAR_PRODUCTS));
        List<WebElement> priceElements = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);        // Process to check if all product prices are under $10
        StringBuilder errorMessages = new StringBuilder();

        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            double price = Double.parseDouble(priceText); // Convert the string to a double
            if (price <= 25 || price >= 50 ) {
                allPricesUnderTen = false; // Set the flag to false if any product price is not under $10
                errorMessages.append(String.format("Product priced at $%.2f found, which should not be under 'Less than $10' filter\n", price));
            }
            System.out.println("Price: " + price);
        }

        System.out.println(errorMessages);
        return allPricesUnderTen;
    }
    /** Method to test Price Functionality $50-$75*/

    public boolean testPriceFilterBetweenFiftyAndSeventyFive() {
        boolean allPricesUnderTen = true;
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsForMenPage.SIMILAR_PRODUCTS));
        List<WebElement> priceElements = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);        // Process to check if all product prices are under $10
        StringBuilder errorMessages = new StringBuilder();

        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            double price = Double.parseDouble(priceText); // Convert the string to a double
            if (price <= 50 || price >=75) {
                allPricesUnderTen = false; // Set the flag to false if any product price is not under $10
                errorMessages.append(String.format("Product priced at $%.2f found, which should not be under '50-$75' filter\n", price));
            }
            System.out.println("Price: " + price);
        }

        System.out.println(errorMessages);
        return allPricesUnderTen;
    }
    /** Method to test Price Functionality over $75*/
    public boolean testPriceFilterOverSeventyFive() {
        boolean allPricesUnderTen = true;
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsForMenPage.SIMILAR_PRODUCTS));
        List<WebElement> priceElements = driver.findElements(LocatorsForMenPage.SIMILAR_PRODUCTS);        // Process to check if all product prices are under $10
        StringBuilder errorMessages = new StringBuilder();

        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            double price = Double.parseDouble(priceText); // Convert the string to a double
            if (price <= 75) {
                allPricesUnderTen = false; // Set the flag to false if any product price is not under $10
                errorMessages.append(String.format("Product priced at $%.2f found, which should not be under 'over $75' filter\n", price));
            }
            System.out.println("Price: " + price);
        }

        System.out.println(errorMessages);
        return allPricesUnderTen;
    }
}


