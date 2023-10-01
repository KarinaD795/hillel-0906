package lesson28;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;


public class FirstSelenideTest {


    private FirefoxDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Configuration.timeout = 10000;
        open("https://www.google.com.ua/");
    }

    @Test
    public void selenideTest() {
        $(By.name("q")).setValue("Hillel").pressEnter();
        sleep(5000);
    }

    @Test
    public void selenideSecondTest() {
        $(By.name("btnK"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.value("Поиск в Google"), Duration.ofSeconds(5000))
                .shouldHave(Condition.exactValue("Поиск в Google"))
                .shouldNotHave(Condition.value("Alex"))
                .click();
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
