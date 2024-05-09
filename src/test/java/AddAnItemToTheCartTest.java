import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/** Add Item to the Cart Test (ONE CASE)*/
@Listeners(ScreenshotListener.class)
public class AddAnItemToTheCartTest extends BaseTest{

    /** Test to check whether We can add the product to our Bag*/
    @Test
    public void testSteps() throws InterruptedException {

        basePage.acceptPrivacyModal();
        if (basePage.isAdDisplayed())
            basePage.closeAdMark();
        MenPage menPage = basePage.hoverOnMenPageDropdown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDropDown1();
        productPage.clickOnSize1();
        productPage.addToCart1();


        Assert.assertEquals(productPage.successText(),AssertionMessages.Add_To_Bag);
    }

}
