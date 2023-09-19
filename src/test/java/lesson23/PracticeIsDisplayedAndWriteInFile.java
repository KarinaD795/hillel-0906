package lesson23;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.time.Duration;
//
////@SuppressWarnings("ALL")
//
//public class PracticeIsDisplayedAndWriteInFile {
//
//    final String EXPECTED_BUY_BTN_COLOR = "rgba(0, 160, 70)";
//    WebDriver driver;
//
//    WebDriverWait webDriverWait;
//
//    @BeforeTest
//    public void setupDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        webDriverWait= new WebDriverWait(driver, Duration.ofSeconds(5000));
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//    }
//
//    @Test
//    public void assertTest() throws IOException {
//        driver.get("http://rozetka.com.ua");
//        WebElement inputSearch= driver.findElement(By.name("search"));
//        WebElement searchBnt= driver.findElement(By.xpath("//button[contains(@class, 'search-form__submit')]"));
//        searchBnt.click();
//        WebElement firstProductTitle = driver.findElement(By.xpath("//span[@class='goods-tile__title']"));
//        firstProductTitle.click();
//
//        WebElement inStockLabel = driver.findElement(By.xpath("//*contains(@class, 'status-label__svg')]"));
//        WebElement inStockLabelColorElement= driver.findElement(By.xpath("//*contains(@class, 'status-label__svg')]"));
//        String inStockLabelColor = inStockLabelColorElement.getCssValue("color");
//
//        WebElement productPageTitle = driver.findElement(By.xpath("//div[@class='product__heading'}//h1"));
//        String productPageTitleText= productPageTitle.getAttribute("innerText");
//
//        String productPriceText = driver.findElement(By.xpath("//*contains(@class, 'product-price__big')]")).getAttribute("innerText");
//
//
//
//
//        if (inStockLabel.isDisplayed() && inStockLabelColor.equals(EXPECTED_BUY_BTN_COLOR)) {
//            FileWriter fileWriter = new FileWriter("TitleAndPrice.txt");
//            fileWriter.write(productPageTitleText + " - " + productPriceText);
//            fileWriter.close();
//        }
//    }
//
//    @AfterTest
//    public void driverQuit(){
//        driver.quit();
//    }
//
//}
//
//


