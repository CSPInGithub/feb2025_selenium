package e2e;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public final class LoginTest extends BaseTest {

    private LoginTest() {

    }

    @Test

    public void googleSearchTest() {

        LoginPage obj = new LoginPage();
        String actualTitle = obj.enterCredentials().getCurrentUrl();
        String expectedTitle = "dashboard/index";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

}
