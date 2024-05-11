package Locators;

import org.openqa.selenium.By;

public class LocatorsForMenPage {
    public static final By VIEW_ALL = By.xpath("//*[@id=\"top-navigation\"]/div/div/div[4]/div/div/div[1]/div/a[1]");
    public static final By PRODUCT = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/a[1]/div/div");
    public static final By SEARCH_RESULT = By.id("num-results");
    public static final By LOWEST_TO_HIGHEST = By.cssSelector("#side-sortBy-filter > ul > li:nth-child(2) > label");
    public static final By HIGHEST_TO_LOWEST = By.xpath("//label[normalize-space()='Price: High to Low']");
    public static final By SIMILAR_PRODUCTS = By.cssSelector(".product-sale-price");
    public static final By QUICK_ADD  = By.cssSelector("a.qa-quickshop-product-btn");
    public static final By SIZE_DROPDOWN_MENU_FOR_2nd = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/div[6]/div[1]/div"); // for the second case
    public static final By SIZE2 = By.xpath("(//a[normalize-space()='M'])[1]"); // for the second case
    public static final By ADD_TO_BAG = By.cssSelector("button[data-test-btn=\"add-to-bag\"]"); //for the second case
    public static final By ADD_TO_CART_SUCCESS_TEXT2 = By.cssSelector("div[class='modal-header added-to-bag-header'] h2[class='modal-title']");

    public static final By PRICE_TAB = By.cssSelector(".filter-group-title.text-capitalize.element-collapsible.collapsed[data-test-filter='price']");
    public static final By LESS_THAN_$10 = By.xpath("(//label[normalize-space()='Less than $10'])[1]");
    public static final By $10_$25 = By.xpath("(//label[normalize-space()='$10 - $25'])[1]");
    public static final By $25_$50 = By.xpath("(//label[normalize-space()='$25 - $50'])[1]");
    public static final By $50_$75 = By.xpath("(//label[normalize-space()='$50 - $75'])[1]");
    public static final By OVER_$75= By.xpath("(//label[normalize-space()='Over $75'])[1]");
}
