import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class SizeDetailsTest extends BaseTest{

    /**Test to check whether it opens "How To Measure" part correctly */
    @Test
    public void TestSteps() throws InterruptedException {

        homePage.acceptPrivacyModal();
        if (homePage.isAdDisplayed())
            homePage.closeAdMark();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDetails();
        productPage.clickOnHowToMeasure();

        Assert.assertEquals(productPage.isChartDisplayed(),AssertionMessages.AssertionMessagesForSizeDetailsTest.ChartDisplayed);

    }

}


