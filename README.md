
# selenium-crhome

A simple Java-Selenium-Testng project for starting a Chrome browser and do

## Setup

- Clone the repository 
- Open a terminal in root and run
```bash
  ./gradlew java
```
- If "BUILD SUCCESFULL" you are set
## Start your first session using Chrome
- Open project in IntelliJ
- Open `StartChrome.java`
- Change `URL_TO_OPEN` constant to open the web-app you want to do actions there
- In `openCloseDriver()` you can run the first launch of Chrome browser and closing it properly.

### Play around
Guided by comments there, change structure of test there with before/after actions and add selenium commands to do actions in the using


## Useful links

- [TestNG Annotations](https://testng.org/annotations.html)
- [Selenium Find Elements](https://www.selenium.dev/documentation/webdriver/elements/finders/)
- [ChromeOptions documentation](https://developer.chrome.com/docs/chromedriver/capabilities)
## Basic Selenium Guide
1. Locate Web Elements
Use methods like `findElement` with different locators:

`WebElement element = driver.findElement(By.id("elementId"));
`

2.  Interact with Elements
Perform actions such as clicking, typing, or retrieving text:

`element.click();

element.sendKeys("Some text");

String text = element.getText();`

3. Wait for Elements (Explicit Waits)
Manage wait times to handle dynamic content:

`WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
`
