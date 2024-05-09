import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(ScreenshotListener.class)
public class SearchTest extends BaseTest{
    /** Test to check whether the search works correctly
     * This is the parameterized test, In testng.xml file you can see the configuration
     * This method will be run by running the testng.xml file
     *  if we need to change the "text" , we need to change the text in testng.xml file
     * */
    @Test
    @Parameters("text")
    public void SearchForTest(String text){
        basePage.acceptPrivacyModal();
        if (basePage.isAdDisplayed())
            basePage.closeAdMark();
        basePage.clickOnSearchSign();
        basePage.addTextSearch(text);
        MenPage menPage = basePage.clickOnSearchButton();

        Assert.assertEquals(menPage.successfulSearch(),AssertionMessages.Search_Result);
    }

    /**Test whether the webpage allows us to perform empty search */
    @Test
    public void EmptySearchTest(){
        basePage.acceptPrivacyModal();
        basePage.closeAdMark();
        basePage.clickOnSearchSign();
        basePage.addEmptyTextSearch();

        String originalPageSource = driver.getPageSource();
        basePage.clickOnSearchButton();
        String newPageSource = driver.getPageSource();

        Assert.assertEquals(newPageSource, originalPageSource, "The page source should remain unchanged after clicking the search button with empty input.");

    }


}


