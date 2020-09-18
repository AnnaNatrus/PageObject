package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
    protected WebDriver driver;
    Page (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
