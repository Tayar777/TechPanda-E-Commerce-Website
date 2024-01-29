import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Main{

    //Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //By
    private By CreateAnAccountButton = By.xpath("//a[@title='Create an Account']");
    private By Email_TextBox = By.xpath("//input[@title='Email Address']");
    private By Password_TextBox = By.xpath("//input[@title='Password']");
    private By LoginButton = By.xpath("//button[@title='Login']");

    //WebElement
    private WebElement CreateAnAccountButtonElement;
    private WebElement Email_TextBoxElement;
    private WebElement Password_TextBoxElement;
    private WebElement LoginButtonElement;


    //Methods
    public void ClickOnCreateAnAccountButton ()
    {
        CreateAnAccountButtonElement = driver.findElement(CreateAnAccountButton);
        Clicking(CreateAnAccountButtonElement);
    }
    public void EnterEmail (String value)
    {
        Email_TextBoxElement = driver.findElement(Email_TextBox);
        SendText(Email_TextBoxElement,value);
    }
    public void EnterPassword (String value)
    {
        Password_TextBoxElement = driver.findElement(Password_TextBox);
        SendText(Password_TextBoxElement,value);
    }
    public void ClickOnLoginButton ()
    {
        LoginButtonElement = driver.findElement(LoginButton);
        Clicking(LoginButtonElement);
    }








}
