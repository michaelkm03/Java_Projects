package com.geniussportsmedia.ContentPrioritization;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    public void startWebdriver(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.linkedin.com");


        driver.close();
        driver.quit();
    }

}
