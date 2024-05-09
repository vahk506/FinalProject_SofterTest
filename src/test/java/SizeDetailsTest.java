import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class SizeDetailsTest extends BaseTest{

    /**Test to check whether it opens "How To Measure" part correctly */
    @Test
    public void TestSteps() throws InterruptedException {

        basePage.acceptPrivacyModal();
        if (basePage.isAdDisplayed())
            basePage.closeAdMark();
        MenPage menPage = basePage.hoverOnMenPageDropdown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDetails();
        productPage.clickOnHowToMeasure();

        Assert.assertEquals(productPage.isChartDisplayed(),AssertionMessages.ChartDisplayed);

    }

}


