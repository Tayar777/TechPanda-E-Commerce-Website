import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends Main_Test {
    private HomePage homePage;

    @Test
    public void CheckMobileButton ()
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMobileButton();
        AssertEqualsByXpath("MOBILE","//div[@class='page-title category-title']");
    }


}
