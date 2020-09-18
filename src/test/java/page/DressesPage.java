package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;


public class DressesPage extends Page {

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    private WebElement dressButton;

    public static final String Start_URL = "http://automationpractice.com/index.php";
    public static final String Dress_URL = "http://automationpractice.com/index.php?id_category=8&controller=category";

    public DressesPage(WebDriver driver) {
        super(driver);
/*        openStartPage();
        openDressesPage();
        atDressPage();*/
    }

    public void openStartPage() {
        driver.get(Start_URL);
        Waiters.waitImplicit(driver,1, TimeUnit.SECONDS);
    }

    public void openDressesPage() {
        dressButton.click();
        //driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();
        Waiters.waitForUrl(driver,Dress_URL,5);
    }

    public boolean checkAtDressPage() {
        if (driver.getCurrentUrl().equals(Dress_URL)) {return true;}
        else {return false;}
    }

    public int colorQty(String colorXpath) throws InterruptedException {
        Thread.sleep(2000);
        //Waiters.wait(driver,5);
        int sizeDressElements;
        sizeDressElements = driver.findElements(By.xpath(colorXpath)).size();
        System.out.println("size - "+sizeDressElements);
        return sizeDressElements;
    }


/*
    public DressesPage openDressesPage(String colorXpath){
        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();
        DressesPage dressesPage = new DressesPage(driver);
        dressesPage.colorQty(colorXpath);
        Waiters.waitForUrl(driver,Dress_URL,10);
        return new DressesPage(driver);
    }*/




}

