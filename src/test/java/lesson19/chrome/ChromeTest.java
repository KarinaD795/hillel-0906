package lesson19.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {

    WebDriver driver;

    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/karina/www/hillel-0906/src/main/resources/chromedriver");
    }

    @BeforeTest

    public void setupDriver(){
      driver = new ChromeDriver();
    }

    @Test
    public void testOnChrome(){
        driver.get("/Users/karina/www/hillel-0906/src/main/resources/chromedriver");
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
