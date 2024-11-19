package startChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class StartChrome {
    /** Add the url of the page you want to do actions in. */
    private static final String URL_TO_OPEN = "https://teamviewer.atlassian.net/jira";



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
        //driver.findElement(By.className("css-1ah6ujv")).click();   //TV logo

        //driver.findElement(By.className("css-khjbnv")).click();   //Create group

        //driver.findElement(By.xpath("//button[@data-testid='atlassian-navigation--create-button']")).click();
        //driver.findElement(locators("atlassian-navigation--create-button")).click();

        //By createButtonLocator = By.xpath("//button[@data-testid='atlassian-navigation--create-button']");
        //WebElement createButton = driver.findElement(createButtonLocator);

        //createButton.click();

        driver.findElement(By.xpath("//*[@data-test-id='search-dialog-input']")).click();
        WebElement searchButton = driver.findElement(locators("search-dialog-input"));
        searchButton.click();
        searchButton.sendKeys("TEAM-60387" + Keys.ENTER);


        /** End of your actions */

        //closeChrome(driver);
    }

    /** Can the crhome close method run even if the test fails and exits? *
     * HINT: TestNG structure                                             */
   private static void closeChrome(WebDriver driver){
        driver.close();
        driver.quit();
    }

    private static By locators(String dataTestID){
        return By.xpath("//*[@data-testid='"+dataTestID+"']");

    }

}
