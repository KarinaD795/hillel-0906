import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HWCopy {
    WebDriver driver;

    WebDriverWait wait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void searchProductWithTop() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptopsAndComputers = driver.findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopsAndComputers.click();

        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();
//
//        WebElement sellerFilte = driver.findElement(By.xpath("//a[@data-id='Rozetka']"));
//        laptops.click();
//
//        WebElement maxValue = driver.findElement(By.xpath("//rz-filter-slider//div/input[2]"));
//        maxValue.clear();
//        maxValue.sendKeys("100000");
//        WebElement submitButton = driver.findElement(By.xpath("//rz-filter-slider//button[@type='submit']"));
//        submitButton.click();
//
//        WebElement topProduct = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()[contains(.,' ТОП ПРОДАЖ ')]]/following-sibling::a")));
//        topProduct.click();
//
//        WebElement labelTopSales = driver.findElement(By.xpath("//span[contains(text(),' ТОП ПРОДАЖ')]"));
//        Assert.assertTrue(labelTopSales.isDisplayed(), "Label TP Sales is displayed");
//
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}





