import AssertionMessages.AssertionMessagesForProductFilterTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class ProductFilterTest extends BaseTest {
    /**
     * Test to check whether the filter L-H works
     * */

    @Test
    public void LowToHighTest(){

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnFilterLtoH();

        Assert.assertEquals(menPage.checkThePricesLowestToHighest(), AssertionMessagesForProductFilterTest.Lowest_To_Highest);

    }
    /**
     * Test to check whether the filter H-L works
     * */
    @Test
    public void HighToLowTest(){
        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnFilterHtoL();

        Assert.assertEquals(menPage.checkThePricesHighestToLowest(), AssertionMessagesForProductFilterTest.Highest_To_Lowest);
    }
}
