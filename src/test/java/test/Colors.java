package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.DressesPage;

public class Colors {

    private WebDriver driver;

    @BeforeMethod (alwaysRun = true)
    public void browserSetUp(){
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }

    @Test(description = "Check qty for orange color")
    public void orangeColor() throws InterruptedException {
    DressesPage dressesPage = new DressesPage(driver);
    dressesPage.openStartPage();
    dressesPage.openDressesPage();
    dressesPage.checkAtDressPage();
    int sizeDressElements = dressesPage.colorQty("//a[@style=\"background:#F39C11;\"]");
    Assert.assertEquals(sizeDressElements,2);
    }

    @Test(description = "Check qty for yellow color")
    public void yellowColor() throws InterruptedException {
        DressesPage dressesPage = new DressesPage(driver);
        dressesPage.openStartPage();
        dressesPage.openDressesPage();
        dressesPage.checkAtDressPage();
        int sizeDressElements = dressesPage.colorQty("//a[@style=\"background:#F1C40F;\"]");
        Assert.assertEquals(sizeDressElements,3);
    }

    @Test(description = "Check qty for beige color")
    public void beigeColor() throws InterruptedException {
        DressesPage dressesPage = new DressesPage(driver);
        dressesPage.openStartPage();
        dressesPage.openDressesPage();
        dressesPage.checkAtDressPage();
        int sizeDressElements = dressesPage.colorQty("//a[@style=\"background:#f5f5dc;\"]");
        Assert.assertEquals(sizeDressElements,1);
    }

    @Test(description = "Check qty for white color")
    public void whiteColor() throws InterruptedException {
        DressesPage dressesPage = new DressesPage(driver);
        dressesPage.openStartPage();
        dressesPage.openDressesPage();
        dressesPage.checkAtDressPage();
        int sizeDressElements = dressesPage.colorQty("//a[@style=\"background:#ffffff;\"]");
        Assert.assertEquals(sizeDressElements, 1);
    }

        @Test(description = "Check qty for black color")
        public void blackColor() throws InterruptedException {
            DressesPage dressesPage = new DressesPage(driver);
            dressesPage.openStartPage();
            dressesPage.openDressesPage();
            dressesPage.checkAtDressPage();
            int sizeDressElements = dressesPage.colorQty("//a[@style=\"background:#434A54;\"]");
            Assert.assertEquals(sizeDressElements, 1);
    }

    @Test(description = "Check qty for blue color")
    public void blueColor() throws InterruptedException {
        DressesPage dressesPage = new DressesPage(driver);
        dressesPage.openStartPage();
        dressesPage.openDressesPage();
        dressesPage.checkAtDressPage();
        int sizeDressElements = dressesPage.colorQty("//a[@style=\"background:#5D9CEC;\"]");
        Assert.assertEquals(sizeDressElements, 1);
    }

    @Test(description = "Check qty for green color")
    public void greenColor() throws InterruptedException {
        DressesPage dressesPage = new DressesPage(driver);
        dressesPage.openStartPage();
        dressesPage.openDressesPage();
        dressesPage.checkAtDressPage();
        int sizeDressElements = dressesPage.colorQty("//a[@style=\"background:#A0D468;\"]");
        Assert.assertEquals(sizeDressElements, 1);
    }

}
