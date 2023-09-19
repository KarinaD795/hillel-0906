package homeworksSelenium.hw26;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@SuppressWarnings("ALL")
public class WebElementsSearch {
    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
    }

    @Test
    public void testOnChromeDriver() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement mainLogoCss = driver.findElement(By.cssSelector("a[href='https://rozetka.com.ua/']"));
        WebElement mainLogoXpath = driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/']"));

        WebElement authenticatorButtonCss = driver.findElement(By.cssSelector("rz-user use[href='#icon-user-simple']"));
        WebElement authenticatorButtonXpath = driver.findElement(By.xpath( "//ul/li[3]/rz-user/button"));

        WebElement trashButtonCss = driver.findElement(By.cssSelector("ul>li rz-cart button"));
        WebElement trashButtonXpath = driver.findElement(By.xpath("//ul/li[7]/rz-cart/button"));
    }

    @AfterTest
    public void close(){
        driver.close();
    }

}

