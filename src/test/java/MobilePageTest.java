import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class MobilePageTest extends Main_Test {

    private HomePage homePage;
    private MobilePage mobilePage;
    private Product1_Page product1_page;

    @BeforeTest
    public void CheckMobileButton ()
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMobileButton();
        AssertEqualsByXpath("MOBILE","//div[@class='page-title category-title']");
    }

    @Test
    public void ChooseSortByName ()  //Task1
    {
        mobilePage = new MobilePage(driver);
        mobilePage.ClickOnSortBy_Name();
        AssertTrueContainsByXpath("IPHONE","//li[@class='item last'][1]");
        AssertTrueContainsByXpath("SAMSUNG GALAXY","//li[@class='item last'][2]");
        AssertTrueContainsByXpath("SONY XPERIA","//li[@class='item last'][3]");
    }


    @Test
    public void VerifyProduct1Cost_InListPageEquals_InDetailsPage ()   //Task2
    {
        mobilePage = new MobilePage(driver);
        WebElement PriceElement1 = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
        String Price1 = PriceElement1.getText();
        mobilePage.ClickOnProduct1();
        WebElement PriceElement11 = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
        String Price11 = PriceElement11.getText();
        Assert.assertEquals(Price1,Price11);
    }

    @Test
    public void CompareBetweenTwoProducts ()  //Task4
    {
        mobilePage = new MobilePage(driver);
        mobilePage.AddProduct1ToCompare();
        AssertTrueContainsByXpath("The product Sony Xperia has been added to comparison list.","//li[@class='success-msg']");
        mobilePage.AddProduct2ToCompare();
        AssertTrueContainsByXpath("The product IPhone has been added to comparison list.","//li[@class='success-msg']");
        String MainWindow = driver.getWindowHandle();
        mobilePage.ClickOnCompare();
        mobilePage.SwitchToTheNewWindow();
        AssertTrueContainsByXpath("SONY XPERIA","//*[@id=\"product_comparison\"]/tbody[1]/tr[1]/td[1]/h2/a");
        AssertTrueContainsByXpath("IPHONE","//*[@id=\"product_comparison\"]/tbody[1]/tr[1]/td[2]/h2/a");
        driver.close();
        driver.switchTo().window(MainWindow);
        mobilePage.ClickOnCompareClearAll();
        mobilePage.ClickOnAlert();
        AssertTrueContainsByXpath("The comparison list was cleared.","//li[@class='success-msg']");
    }








}
