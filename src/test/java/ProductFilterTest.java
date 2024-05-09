import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class ProductFilterTest extends BaseTest {
    /**
     * Test to check whether the filter l-H works
     * */

    @Test
    public void TestSteps() throws InterruptedException {

        basePage.acceptPrivacyModal();
        if (basePage.isAdDisplayed())
            basePage.closeAdMark();
        MenPage menPage = basePage.hoverOnMenPageDropdown();
        menPage.clickOnViewAll();
        menPage.clickOnFilterLtoH();

        Assert.assertEquals(menPage.checkThePrices(), AssertionMessages.Lowest_TO_Highest);

    }
}
