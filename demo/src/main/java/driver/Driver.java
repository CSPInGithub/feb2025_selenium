package driver;

import java.time.Duration;
import java.util.Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    // Private constructor to prevent instantiation
    private Driver() {
    }

    // ThreadLocal WebDriver instance for parallel execution
    private static final ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    // Private method to initialize WebDriver (not exposed)
    private static void initialize() {
        if (Objects.isNull(threadLocalDriver.get())) {
            WebDriver driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            threadLocalDriver.set(driver);

            // Ensure the driver quits when JVM shuts down
            //Runtime.getRuntime().addShutdownHook(new Thread(Driver::shutDown));
        }
    }

    // Public method to get the current thread's WebDriver instance
    public static WebDriver getDriver() {
        if (Objects.isNull(threadLocalDriver.get())) {
            initialize();  // Initialize only when needed
        }
        return threadLocalDriver.get();
    }

    // Private method to shutdown WebDriver (not exposed)
    private static void shutDown() {
        if (Objects.nonNull(threadLocalDriver.get())) {
            threadLocalDriver.get().quit();
            threadLocalDriver.remove(); // Remove instance from ThreadLocal storage
        }
    }
    // Public method to trigger cleanup from BaseTest
    public static void cleanup() {
        shutDown();
    }
}
