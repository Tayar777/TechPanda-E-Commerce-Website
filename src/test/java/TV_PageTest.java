import org.testng.annotations.Test;

public class TV_PageTest extends Main_Test {

    private HomePage homePage;
    private LoginPage loginPage;
    private TV_Page tvPage;
    private WishListPage wishListPage;

    @Test
    public void CheckSharingWishList ()    //Task 5
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMyAccountButton();
        loginPage = new LoginPage(driver);
        loginPage.EnterEmail("Tayar7@outlook.com");
        loginPage.EnterPassword("123456");
        loginPage.ClickOnLoginButton();
        homePage.ClickOnTV_Button();
        tvPage = new TV_Page(driver);
        tvPage.AddToWishList_LG_TV();
        AssertTrueContainsByXpath("LG LCD has been added to your wishlist. Click here to continue shopping.","//li[@class='success-msg']");
        wishListPage = new WishListPage(driver);
        wishListPage.ClickOnShareWishListButton();
        wishListPage.EnterShareWishList_Email("Ahmedtarek62@hotmail.com");
        wishListPage.EnterShareWishList_Message("This TV is awesome!");
        wishListPage.ClickOnShareWishListButton();
        AssertTrueContainsByXpath("Your Wishlist has been shared.","//li[@class='success-msg']");
    }
}
