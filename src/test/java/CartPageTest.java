import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends Main_Test {

    CartPage cartPage;
    HomePage homePage;
    MobilePage mobilePage;
    LoginPage loginPage;
    WishListPage wishListPage;
    CheckOutPage checkOutPage;

    @Test
    public void VerifyThatYouCannotAddMoreProductsThanTheAgreedLimit ()   //Task3
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMobileButton();
        mobilePage = new MobilePage(driver);
        mobilePage.AddProduct1ToCart();
        cartPage = new CartPage(driver);
        cartPage.ClearQuantity();
        cartPage.EnterQuantity("1000");
        cartPage.ClickUpdate_ForQuantity();
        AssertEqualsByXpath("Some of the products cannot be ordered in requested quantity.","//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span");
        AssertTrueContainsByXpath("The maximum quantity allowed for purchase is 500.","//p[@class='item-msg error']");
        cartPage.ClickOnEmptyCartLink();
        AssertTrueContainsByXpath("SHOPPING CART IS EMPTY","//div[@class='page-title']");
    }

    @Test
    public void PurchaseProduct ()  //Task 6
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMyAccountButton();
        loginPage = new LoginPage(driver);
        loginPage.EnterEmail("Tayar7@outlook.com");
        loginPage.EnterPassword("123456");
        loginPage.ClickOnLoginButton();
        homePage.GoToHomePage();
        homePage.ClickOnGoToWishList();
        wishListPage = new WishListPage(driver);
        wishListPage.ClickOnAddToCartButton();
        cartPage = new CartPage(driver);
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
        AssertTrueContainsByXpath("YOUR ORDER HAS BEEN RECEIVED.","//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1");
    }

    @Test
    public void VerifyDiscountCoupon () //Task 9
    {

        homePage = new HomePage(driver);
        homePage.ClickOnMobileButton();
        mobilePage = new MobilePage(driver);
        mobilePage.AddProduct3ToCart();
        cartPage = new CartPage(driver);
        WebElement Price1 = driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span"));
        String Price11 = Price1.getText();
        cartPage.EnterDiscountCode("GURU50");
        cartPage.ClickApplyOnDiscountCode();
        WebElement Price2 = driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span"));
        String Price22 = Price2.getText();
        System.out.println(Price11);
        System.out.println(Price22);
        Assert.assertNotEquals(Price2,Price1);

    }




}
