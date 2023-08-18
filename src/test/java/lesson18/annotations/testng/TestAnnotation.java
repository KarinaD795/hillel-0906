package lesson18.annotations.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {

    @BeforeTest
    public void beforeTest(){
        System.out.println("method before Test ");
    }


    @Test
    public void test(){
        System.out.println("our first test");
    }

    @Test
    public void test2(){
        System.out.println("our second test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("method after test");
    }

}
