
import AssertionMessages.AssertionMessagesForSearchTest;
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
    public void SearchTest(String text){
        homePage.acceptPrivacyModal();
        homePage.clickOnSearchSign();
        homePage.addTextSearch(text);
        SearchResultPage searchResult = homePage.clickOnSearchButton();
        boolean flag = searchResult.FetchingTheSearchResult(text);

        Assert.assertEquals(flag, AssertionMessagesForSearchTest.Search_Result , "We have  products under that ID/Key");
    }

    /**Test whether the webpage allows us to perform empty search */
    @Test
    public void EmptySearchTest(){
        homePage.acceptPrivacyModal();
        homePage.clickOnSearchSign();
        homePage.addEmptyTextSearch();

        String originalPageSource = driver.getPageSource();
        homePage.clickOnSearchButton();
        String newPageSource = driver.getPageSource();

        Assert.assertNotEquals(newPageSource, originalPageSource, AssertionMessagesForSearchTest.Empty_Search);

    }

    /** Test to check whether the search by random character will give some result or not*/
    /**
     * Here is a bag, it allows us to find some products with a key word consisting of random symbols
     * As a result this test will always fail.
     * */
    @Test
    @Parameters("length")
    public void InvalidSearchTest(int length){
        homePage.acceptPrivacyModal();
        homePage.clickOnSearchSign();
        homePage.AddRandomText(length);;
        SearchResultPage searchResult = homePage.clickOnSearchButton();


        Assert.assertEquals(searchResult.successfulSearch(), AssertionMessagesForSearchTest.Search_Result_With_Random_Symbols);
    }


}


