package lesson24;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

@SuppressWarnings({"ALL", "TestFailedLine"})

public class PracticeFindElements extends InitialDriver {



    @Test

    public void findElementsTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        sleep(5000);
        WebElement laptopsAndComputers= driver.findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopsAndComputers.click();
        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбки'][1]"));
        laptops.click();
        List<WebElement> productsFromSearch = driver.findElements(By.xpath("//div[@class= 'goods-tile__inner']"));


        int countProduct = productsFromSearch.size();
        Assert.assertEquals(countProduct, 60);



    }

}
