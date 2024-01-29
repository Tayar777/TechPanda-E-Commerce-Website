import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Main_Test {

    //Attributes
    protected WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    public void AssertEqualsByXpath (String Expected,String xPath)
    {
        WebElement element = driver.findElement(By.xpath(xPath));
        String Actual = element.getText();
        Assert.assertEquals(Actual,Expected);
    }
    public void AssertTrueContainsByXpath (String Expected,String xPath)
    {
        WebElement element = driver.findElement(By.xpath(xPath));
        String Actual = element.getText();
        Assert.assertTrue(Actual.contains(Expected));
    }

    @BeforeTest
    public void OpenBrowser ()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://live.techpanda.org/index.php/");
        AssertEqualsByXpath("THIS IS DEMO SITE FOR   ","//div[@class='page-title']");
    }


    @AfterTest
    public void QuitBrowser ()
    {
        driver.quit();
    }
     

}
