import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/** Add Item to the Cart Test (ONE CASE)*/
@Listeners(ScreenshotListener.class)
public class PriceFilterTest extends BaseTest{

    /**  Less than $10*/
    @Test
    public void lessThanTenTest(){

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnPriceTab();
        menPage.clickOnLessThan_$10();
        boolean flag = menPage.testPriceFilterLessThanTen();
        Assert.assertTrue(flag);

    }
    /**
     *  $10-$25
     *  */
    @Test
    public void testPriceFilterBetweenTenAndTwentyFive(){

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnPriceTab();
        menPage.clickOn$10_$25();
        boolean flag = menPage.testPriceFilterBetweenTenAndTwentyFive();
        Assert.assertTrue(flag);

    }
    /**
     *  $25-$50
     *  */
    @Test
    public void BetweenTwentyFiveAndFiftyTest(){
        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnPriceTab();
        menPage.clickOn$25_$50();
        boolean flag = menPage.testPriceFilterBetweenTwentyFiveAndFifty();
        Assert.assertTrue(flag);
    }
    /**
     * $50-$75
     * */
    @Test
    public void BetweenTwentyBetweenFiftyAndSeventyFive(){
        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnPriceTab();
        menPage.clickOn$50_$75();
        boolean flag = menPage.testPriceFilterBetweenFiftyAndSeventyFive();
        Assert.assertTrue(flag);
    }
    /** Over 75$*/
    @Test
    public void BetweenTwentyOverSeventyFive(){
        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnPriceTab();
        menPage.clickOnOver_$75();
        boolean flag = menPage.testPriceFilterOverSeventyFive();
        Assert.assertTrue(flag);
    }

}
