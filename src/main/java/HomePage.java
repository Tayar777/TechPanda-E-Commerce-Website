import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Main {

    //Constructors
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    //By
    private By MobileButton = By.linkText("MOBILE");
    private By TV_Button = By.linkText("TV");
    private By MyAccountButton = By.linkText("MY ACCOUNT");
    private By GoToWishList = By.linkText("Go to Wishlist");
    private By Logo = By.xpath("//a[@class='logo']");


    //WebElements
    private WebElement MobileButtonElement;
    private WebElement TV_ButtonElement;
    private WebElement MyAccountButtonElement;
    private WebElement GoToWishListElement;
    private WebElement LogoElement;

    //Methods
    public void ClickOnMobileButton ()
    {
        MobileButtonElement = driver.findElement(MobileButton);
        Clicking(MobileButtonElement);
    }
    public void ClickOnTV_Button ()
    {
        TV_ButtonElement = driver.findElement(TV_Button);
        Clicking(TV_ButtonElement);
    }
    public void ClickOnMyAccountButton ()
    {
        MyAccountButtonElement = driver.findElement(MyAccountButton);
        Clicking(MyAccountButtonElement);
    }
    public void ClickOnGoToWishList ()
    {
        GoToWishListElement = driver.findElement(GoToWishList);
        Clicking(GoToWishListElement);
    }
    public void GoToHomePage ()
    {
        LogoElement = driver.findElement(Logo);
        Clicking(LogoElement);
    }





}
