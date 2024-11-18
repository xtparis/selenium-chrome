package startChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class StartChrome {
    /** Add the url of the page you want to do actions in. */
    private static final String URL_TO_OPEN = "https://teamviewer.atlassian.net/jira/TEAM-53978";

    @Test
    public static void openCloseDriver(){
        Logger LOGGER = Logger.getLogger("PRINTER");

        /** Initiate an Options set for your drive with just the disablement of  *
         the search engine selection popup you can play along with adding more *
         options that will make your actions in the browser easier             */
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        WebDriver driver = new ChromeDriver(options);
        driver.get(URL_TO_OPEN);

        /** Maximize the window to see it in full screen */
        driver.manage().window().maximize();

        /** Add your actions here (README links for help) */


        /** End of your actions */

        closeChrome(driver);
    }

    /** Can the crhome close method run even if the test fails and exits? *
     * HINT: TestNG structure                                             */
    private static void closeChrome(WebDriver driver){
        driver.close();
        driver.quit();
    }
}
