import AssertionMessages.AssertionMessagesForEnterValidZipcodeTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class EnterValidZipCodeTest extends BaseTest{
    /**
     * Test to check whether we can Add Valid Zip code and see whether it brings correct address under that zipcode
     * */
    @Test
    public void testSteps() throws InterruptedException {

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDropDown1();
        productPage.clickOnSize1();
        productPage.addZipCode();
        productPage.clickOnSearch();

        Assert.assertEquals(productPage.addressInfo(), AssertionMessagesForEnterValidZipcodeTest.ZipCode_Address);
    }

}


