import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyOrdersPageTest extends Main_Test{

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private MyOrdersPage myOrdersPage;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;




    @Test
    public void PrintPlacedOrder_PDFfile ()  //task 7
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMyAccountButton();
        loginPage = new LoginPage(driver);
        loginPage.EnterEmail("Tayar7@outlook.com");
        loginPage.EnterPassword("123456");
        loginPage.ClickOnLoginButton();
        myAccountPage = new MyAccountPage(driver);
        myAccountPage.ClickOnMyOrdersButton();
        myOrdersPage = new MyOrdersPage(driver);
        myOrdersPage.ClickOnViewOrder();
        System.out.println(driver.getWindowHandle());
        myOrdersPage.ClickOnPrintOrder();
        myOrdersPage.SwitchToTheNewWindow();
    }
    @Test
    public void ReOrderPreviouslyAddedPruduct ()  //Task 8
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMyAccountButton();
        loginPage = new LoginPage(driver);
        loginPage.EnterEmail("Tayar7@outlook.com");
        loginPage.EnterPassword("123456");
        loginPage.ClickOnLoginButton();
        myAccountPage = new MyAccountPage(driver);
        myAccountPage.ClickOnMyOrdersButton();
        myOrdersPage = new MyOrdersPage(driver);
        myOrdersPage.ClickOnReOrder();
        cartPage = new CartPage(driver);
        WebElement Price1 = driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span"));
        String Price11 = Price1.getText();
        cartPage.ClearQuantity();
        cartPage.EnterQuantity("10");
        cartPage.ClickUpdate_ForQuantity();
        WebElement Price2 = driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span"));
        String Price22 = Price2.getText();
        Assert.assertNotEquals(Price2,Price1);
        cartPage.SelectCountry("United States");
        cartPage.SelectState("New York");
        cartPage.EnterZIP("542896");
        cartPage.ClickEstimate();
        cartPage.AddWait();
        cartPage.Select_EstimateRadioButton();
        cartPage.ClickOnUpdateTotalButton();
        cartPage.ClickOnCheckoutButton();
        checkOutPage = new CheckOutPage(driver);
        checkOutPage.ClickOnContinueButton1();
        checkOutPage.AddWait();
        checkOutPage.ClickOnContinueButton3();
        checkOutPage.AddWait();
        checkOutPage.SelectMoneyOrder_RadioButton();
        checkOutPage.ClickOnContinueButton4();
        checkOutPage.AddWait();
        checkOutPage.ClickOnPlaceOrderButton();
        AssertTrueContainsByXpath("YOUR ORDER HAS BEEN RECEIVED.","//div[@class='page-title']");
    }






}
