import AssertionMessages.AssertionMessagesForEditBagTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(ScreenshotListener.class)
public class EditBagTest extends BaseTest{
    /**
     * Test to check whether we can Edit the bag, by adding the quantity of product
     * This is the parameterized test, In testng.xml file you can see the configuration
     * This method will be run by running the testng.xml file
     * if we need to change the "value" , we need to change the value in testng.xml file
     * */
    @Test
    @Parameters("value1")
    public void testAddQuantity(int value1) throws InterruptedException {

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDropDown1();
        productPage.clickOnSize1();
        productPage.addToCart1();
        BagPage bagPage = productPage.clickOnBag();
        bagPage.clickOnEdit();

        int initialQuantity = Integer.parseInt(bagPage.quantityBeforeUpdate().replaceAll("[^\\d]", ""));

        bagPage.addQuantity(value1); //add quantity "value" times
        bagPage.clickOnUpdate();

        int updatedQuantity = Integer.parseInt(bagPage.quantityAfterUpdate().replaceAll("[^\\d]", ""));
        int expectedQuantity = initialQuantity + value1;
        System.out.println(initialQuantity);
        System.out.println(expectedQuantity);
        Assert.assertEquals(updatedQuantity, expectedQuantity, AssertionMessages.AssertionMessagesForEditBagTest.Quantity_updated_successfully);

    }

    /**
     * Test to check whether we can Edit the bag, by adding the quantity of product
     * This is the parameterized test, In testng.xml file you can see the configuration
     * This method will be run by running the testng.xml file
     * if we need to change the "value" , we need to change the value in testng.xml file
     * */
    @Test
    @Parameters({"value1", "value2"})
    public void testDecreaseQuantity(int value1 , int value2) throws InterruptedException {

        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDropDown1();
        productPage.clickOnSize1();
        productPage.addToCart1();
        BagPage bagPage = productPage.clickOnBag();
        bagPage.clickOnEdit();

        int initialQuantity = Integer.parseInt(bagPage.quantityBeforeUpdate().replaceAll("[^\\d]", ""));

        if(bagPage.QuantityInfo() == 1)
            bagPage.addQuantity(value1); //add Quantity "value1" times if there is only 1 product

        bagPage.decreaseQuantity(value2); //decrease quantity "value2" times
        bagPage.clickOnUpdate();
        int updatedQuantity = Integer.parseInt(bagPage.quantityAfterUpdate().replaceAll("[^\\d]", ""));
        int expectedQuantity = initialQuantity + value1 - value2;
        System.out.println(initialQuantity);
        System.out.println(expectedQuantity);
        Assert.assertEquals(updatedQuantity, expectedQuantity, AssertionMessagesForEditBagTest.Quantity_updated_successfully);

    }
    /** Test to check whether we can remove the product from the bag  */
    @Test
    public void removeProductTest() throws InterruptedException {
        homePage.acceptPrivacyModal();
        MenPage menPage = homePage.hoverOnMenDropDown();
        menPage.clickOnViewAll();
        ProductPage productPage = menPage.clickOnProduct();
        productPage.clickOnSizeDropDown1();
        productPage.clickOnSize1();
        productPage.addToCart1();
        BagPage bagPage = productPage.clickOnBag();
        bagPage.clickOnRemoveProduct();

        Assert.assertEquals(bagPage.BagInfo(), AssertionMessagesForEditBagTest.Bag_Is_Empty);



    }


}
