package lesson25;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeWindowHandles extends InitialDriver {

    @Test
    public void selectedTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted']"));
        loginBtn.click();

        WebElement regBtn = driver.findElement(By.xpath("//div[@class='form__row auth-modal__form-bottom']//button[2]"));
        regBtn.click();



    }
}
