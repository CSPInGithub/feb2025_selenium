package com.example.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownTest {

    @Test
    public void selectDrop() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.youtube.com/");

        String searchedValue= "jio";
        String searchedValueBold="coin1";
        boolean isFound = false; 

        driver.findElement(By.cssSelector("[name='search_query'][role='combobox']")).sendKeys(searchedValue);

        List<WebElement> listOfResults = driver
                .findElements(By.cssSelector(".ytSuggestionComponentLeftContainer .ytSuggestionComponentBold"));

        for (WebElement result : listOfResults) {

            Actions act = new Actions(driver);

            act.sendKeys(Keys.DOWN).perform();
            Thread.sleep(500);
            
            String actual = result.getText().trim();
            if (actual.equals(searchedValueBold)) {
                isFound=true;
                act.sendKeys(Keys.ENTER).perform();
                break;

            }

        }
        if (!isFound) {
            System.out.println("Error: The searched value '" + searchedValueBold + "' was not found in the list.");
        }

        driver.quit();

    }

}
