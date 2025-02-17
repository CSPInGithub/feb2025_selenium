package e2e;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.Driver;

public class BaseTest {

    protected BaseTest() {

    }

    @BeforeMethod
    public void setup() {

        Driver.getDriver();

    }

    @AfterMethod
    public void exit() {

        Driver.cleanup();

    }

}
