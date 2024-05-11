package Locators;

import org.openqa.selenium.By;

public class LocatorsForProductPage {
    public static final By SIZE_DROPDOWN_MENU = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]");// for the first case
    public static final By SIZE1 = By.cssSelector("div[class='_pdp-cap_xoau9b _pdp-grid_xoau9b'] li:nth-child(1) a:nth-child(1)"); // for the first case
    public static final By ADD_TO_CART = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[3]/button");
    public static final By ADD_TO_CART_SUCCESS_TEXT = By.className("modal-title");
    public static final By ZipCode = By.className("form-input-postal-code");
    public static final By SEARCH_BUTTON_FOR_ZIPCODE =  By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[4]/div/form/button");
    public static final By ZipCode_ADDRESS = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[4]/div/div/div/ul/li/div[1]/div/span");
    public static final By SIZE_DETAILS = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[1]/button");
    public static final By HOW_TO_MEASURE = By.cssSelector("a[aria-label='how to measure']");
    public static final By CHART = By.className("_sizing-content-htm_n0mbkz");
    public static final By BAG = By.cssSelector("button[data-test-btn=\"viewBag\"]");

}
