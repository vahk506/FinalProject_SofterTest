package Locators;

import org.openqa.selenium.By;

public class LocatorsForBagPage {
    public static final By EDIT = By.cssSelector("button[data-test-btn=\"editCommerceItem\"]");
    public static final By ADD_QUANTITY = By.cssSelector("button.qty-inc-btn._qty-inc-btn_gjd6pr[aria-label=\"increase\"] svg[data-test-icon=\"plus\"]\n");
    public static final By DECREASE_QUANTITY = By.cssSelector("button[aria-label=\"decrease\"]\n");
    public static final By UPDATE_THE_BAG = By.cssSelector("button.btn.btn-primary.btn-block.qa-item-btn-edit");
    public static final By SIZE_DROPDOWN_MENU_FOR_3nd = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/div[6]/div[1]/div"); // for the third case
    public static final By QUANTITY_AFTER_UPDATE = By.cssSelector("div[data-test-cart-item-quantity]\n");
    public static final By QUANTITY_BEFORE_UPDATE = By.cssSelector("div[data-test-cart-item-quantity]\n");
    public static final By REMOVE_PRODUCT_FROM_BAG = By.cssSelector("button.btn-link.qa-btn-remove-commerce-item[data-test-btn=\"removeCommerceItem\"]\n");
    public static final By NUMBER_OF_PRODUCTS_TO_BE_ADDED_TO_BAG = By.cssSelector("span.qty-content._qty-content_gjd6pr\n");

}
