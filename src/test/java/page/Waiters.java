package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Waiters {

    public static void waitForUrl(WebDriver driver, String url, int
            maxTimeSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, maxTimeSeconds);
        wait.until(ExpectedConditions.urlToBe(url));
    }
    public static void waitImplicit(WebDriver driver, int time, TimeUnit
            timeUnit) {
        driver.manage().timeouts().implicitlyWait(time, timeUnit);
    }

    public static void wait(WebDriver driver, int
            seconds) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.wait(seconds);
    }

}

