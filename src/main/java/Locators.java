import org.openqa.selenium.By;
/** Class for Locators
 * There was not possible to get CSSselectors for some locators, as a result I took the working ones.
 * */
public class Locators {

    public static final By PRIVACY_MODAL = By.id("onetrust-accept-btn-handler");
    public static final By AD_MARK = By.cssSelector("[class=\"bx-close bx-close-link bx-close-inside\"]");
    public static final By LINK_TO_MEN_PAGE = By.cssSelector("[aria-label=\"Men category\"]");
    public static final By PRODUCT = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/a[1]/div/div");
    public static final By VIEW_ALL = By.xpath("//*[@id=\"top-navigation\"]/div/div/div[4]/div/div/div[1]/div/a[1]");
    public static final By QUANTITY_AFTER_UPDATE = By.cssSelector("div[data-test-cart-item-quantity]\n");
    public static final By QUANTITY_BEFORE_UPDATE = By.cssSelector("div[data-test-cart-item-quantity]\n");
    public static final By SIZE_DROPDOWN_MENU = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]");// for the first case
    public static final By SIZE_DROPDOWN_MENU_FOR_2nd = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/div[6]/div[1]/div"); // for the second case
    public static final By SIZE_DROPDOWN_MENU_FOR_3nd = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/div[6]/div[1]/div"); // for the third case
    public static final By REMOVE_PRODUCT_FROM_BAG = By.cssSelector("button.btn-link.qa-btn-remove-commerce-item[data-test-btn=\"removeCommerceItem\"]\n");

    public static final By ADD_TO_BAG = By.cssSelector("button[data-test-btn=\"add-to-bag\"]"); //for the second case
    public static final By SIZE1 = By.xpath("/html/body/div[3]/div[7]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/ul/li[1]"); // for the first case
    public static final By SIZE2 = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/div[6]/div[1]/ul/li[1]"); // for the second case
    public static final By SIZE3 = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/div[6]/div[1]/ul/li[3]");
    public static final By SIZE4 = By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/div[6]/div[1]/ul/li[3]");
    public static final By ADD_TO_CART = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[3]/button");
    public static final By ADD_TO_CART_SUCCESS_TEXT = By.className("modal-title");
    public static final By ADD_TO_CART_SUCCESS_TEXT2 = By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/h2");

    public static final By BAG = By.cssSelector("button[data-test-btn=\"viewBag\"]");
    public static final By UPDATE_THE_BAG = By.cssSelector("button.btn.btn-primary.btn-block.qa-item-btn-edit");

    public static final By EDIT = By.cssSelector("button[data-test-btn=\"editCommerceItem\"]");
    public static final By ADD_QUANTITY = By.cssSelector("button.qty-inc-btn._qty-inc-btn_gjd6pr[aria-label=\"increase\"] svg[data-test-icon=\"plus\"]\n");
    public static final By DECREASE_QUANTITY = By.cssSelector("button[aria-label=\"decrease\"]\n");
    public static final By ZipCode = By.className("form-input-postal-code");
    public static final By SEARCH_BUTTON_FOR_ZIPCODE = By.cssSelector("button.btn.btn-primary.qa-btn-search[name='search']");
    public static final By ZipCode_ADDRESS = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[4]/div/div/div/ul/li/div[1]/div/span");

    public static final By SEARCH_SIGN = By.xpath("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]/button");
    public static final By SEARCH_TEXT_BOX = By.xpath("//input[@name='search']");
    public static final By Search_BTN = By.className("search-btn");
    public static final By SEARCH_RESULT = By.id("num-results");

    public static final By SIZE_DETAILS = By.xpath("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[1]/button");
    public static final By HOW_TO_MEASURE = By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div[1]/ul/li[2]");
    public static final By CHART = By.className("_sizing-content-htm_n0mbkz");

    public static final By LOWEST_TO_HIGHEST = By.cssSelector("#side-sortBy-filter > ul > li:nth-child(2) > label");
    public static final By SIMILAR_PRODUCTS = By.cssSelector("[data-test-product-name=\"\"]");

    public static final By QUICK_ADD  = By.cssSelector("a.qa-quickshop-product-btn");

    public static final By NUMBER_OF_PRODUCTS_TO_BE_ADDED_TO_BAG = By.cssSelector("span.qty-content._qty-content_gjd6pr\n");

}