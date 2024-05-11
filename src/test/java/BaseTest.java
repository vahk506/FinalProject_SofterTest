import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseTest {
     WebDriver driver;
//    RemoteWebDriver driver;
    HomePage homePage;

    /** Class that is responsible for correctly Set up  Remote Web Driver*/
    @BeforeClass
    public void SetUp() throws Exception {

        // Set up Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // opens browser window maximized

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

        // Navigate to website
        driver.get("https://www.ae.com/us/en");
        System.out.println("Page title is: " + driver.getTitle());


        homePage = new HomePage(driver);

        ScreenshotListener screenshotListener = new ScreenshotListener();
        screenshotListener.setDriver(driver);
    }
    /**
     * Method that is invoked after each test execution
     * It closes the Page
     * */
    @AfterClass
    public void tearDown () {
        driver.quit();
    }

}
