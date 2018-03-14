package com.geniussportsmedia.ContentPrioritization;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main( String[] args ) throws IOException {
/*
        // Create Driver (Chrome Browser)
        WebDriver driver = new ChromeDriver();
*/
        // Create Configuration Object
        Configuration c = new Configuration();
/*
        // Navigate to Home Page
        driver.navigate().to(c.baseURL + c.endpoints.get("Home"));

        // Navigate to InPlay Page
        driver.navigate().to(c.baseURL + c.endpoints.get("In-Play"));
*/
        // Request Tree
        String url = c.baseJSON + c.endpoints.get("OUTRIGHTS_TREE");
        String tree = c.requestEndpoint(url);
        System.out.println(tree);

        // Request Event Specific Market List
        String event = c.baseSpecific + c.eventQuery + "9031";
        String eventMarketList = c.requestEndpoint(event);
        System.out.println(event);

        // Request Competition Specific Market List
        String competition = c.baseSpecific + c.competitionQuery + "36";
        String eventCompetitonList = c.requestEndpoint(competition);
        System.out.println(competition);



        /*  SELENIUM STUFF
        List<WebElement> sportsEndpoints = driver.findElements(By.xpath("//*[@id=\"az-sport-tree-container\"]/div/ul/li[2]/a/@href"));
        System.out.println(sportsEndpoints.size());
        System.out.println(sportsEndpoints.get(0).getText());
        List<WebElement> AZSportsTree_Values = driver.findElements(By.className("c-sport-menu__link-name"));
        for (int i = 0; i < sportsEndpoints.size(); i++){
            // System.out.println(baseURL + ("/sport?sportId=" + sportsEndpoints.get(i).getText().replaceAll(" ","_").toUpperCase() + "&culture=en-GB"));
            // System.out.println(sportsEndpoints.get(i).getAttribute("href"));
        }

        driver.close();
        driver.quit();

        WebElement inPlayFixtures = driver.findElement(By.xpath("//*[@id=\"prematchupnexttree\"]/div/div[2]"));
        System.out.println(inPlayFixtures.getText());
        List<WebElement> selections = driver.findElements(By.className("ui-sportsbook-navigation-FixtureNavigationNode-TopMarket"));
        List<WebElement> selections = driver.findElements(By.xpath("//*[@id=\"prematchupnexttree\"]/div/div[2]"));

        List<WebElement> selections = driver.findElement(By.xpath("//*[@id=\"featuredtree\"]/div/div[2]/div[3]/div/div/div/div/"));

        for (int i = 1; i < 5;i++){
            driver.findElement(By.xpath("//*[@id=\"featuredtree\"]/div/div[2]/div[3]/div/div/div/div/" + "button[" + i + "]")).click();
        }
        */

    }

}