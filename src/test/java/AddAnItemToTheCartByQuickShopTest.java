import AssertionMessages.AssertionMessagesForQuickShopTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/** Add Item to the Cart Test By Quick Shop (SECOND CASE)*/

@Listeners(ScreenshotListener.class)
public class AddAnItemToTheCartByQuickShopTest extends BaseTest{
    /** Test to check whether We can add the product to our Bag By using Quick Add button*/
    @Test
    public void testSteps() throws InterruptedException {

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        menPage.clickOnQuickShop();
        menPage.clickOnSizeDropDown1();
        menPage.clickOnSize2();
        menPage.clickOnAddToBag2();


        Assert.assertEquals(menPage.successText(), AssertionMessagesForQuickShopTest.Add_To_Bag);
    }

}
