import org.testng.annotations.Test;

public class RegisterPageTest extends Main_Test {

    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;



    @Test
    public void CreateAnAccount ()     //Task 5
    {
        homePage = new HomePage(driver);
        homePage.ClickOnMyAccountButton();
        loginPage = new LoginPage(driver);
        loginPage.ClickOnCreateAnAccountButton();
        registerPage = new RegisterPage(driver);
        registerPage.EnterFirstName("Ahmed");
        registerPage.EnterLastName("Tarek");
        registerPage.EnterEmail("Tayar7@outlook.com");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickOnRegisterButton();
        AssertTrueContainsByXpath("Thank you for registering with Main Website Store.","//li[@class='success-msg']");
    }


}
