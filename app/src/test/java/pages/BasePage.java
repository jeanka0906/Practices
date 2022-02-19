package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    // private static Actions actions;

    static {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webDriver/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement Locator(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void Click(String locator) {
        Locator(locator).click();
    }

    public String getText(String locator) {
        return Locator(locator).getText();
    }

    public Boolean isDisplayed(String locator) {
        return Locator(locator).isDisplayed();
    }

    public void sendKeys(String locator, String textToWirte){
        Locator(locator).clear();
        Locator(locator).sendKeys(textToWirte);
    }

}
