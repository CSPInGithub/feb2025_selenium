package pages;

import org.openqa.selenium.By;

import driver.Driver;

public final class LoginPage {

    // protected LoginPage(){

    // }

    public DashboardPage enterCredentials() {

        Driver.getDriver().findElement(By.cssSelector("[name='username']")).sendKeys("Admin");

        Driver.getDriver().findElement(By.cssSelector("[name='password']")).sendKeys("admin123");

        Driver.getDriver().findElement(By.cssSelector("[type='submit']")).click();
        
        return new DashboardPage();
    }

    

}
