package Locators;

import org.openqa.selenium.By;

public class LocatorsForHomePage {
    public static final By PRIVACY_MODAL = By.id("onetrust-accept-btn-handler");
    public static final By AD_MARK = By.cssSelector("[class=\"bx-close bx-close-link bx-close-inside\"]");
    public static final By LINK_TO_MEN_PAGE = By.cssSelector("[aria-label=\"Men category\"]");

    public static final By SEARCH_SIGN = By.xpath("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]/button");
    public static final By SEARCH_TEXT_BOX = By.xpath("//input[@name='search']");
    public static final By Search_BTN = By.className("search-btn");

}
