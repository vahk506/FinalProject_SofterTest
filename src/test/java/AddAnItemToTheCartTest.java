import AssertionMessages.AssertionMessagesForAddToCartTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/** Add Item to the Cart Test (ONE CASE)*/
@Listeners(ScreenshotListener.class)
public class AddAnItemToTheCartTest extends BaseTest{

    /** Test to check whether We can add the product to our Bag*/
    @Test
    public void testSteps() throws InterruptedException {

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDropDown1();
        productPage.clickOnSize1();
        productPage.addToCart1();


        Assert.assertEquals(productPage.successText(), AssertionMessagesForAddToCartTest.Add_To_Bag);
    }

}
