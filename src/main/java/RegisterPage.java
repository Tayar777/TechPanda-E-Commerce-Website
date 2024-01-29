import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Main {

    //Constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //By
    By FirstName_TextBox = By.name("firstname");
    By LastName_TextBox = By.name("lastname");
    By Password_TextBox = By.name("password");
    By ConfirmPassword_TextBox = By.name("confirmation");
    By Email_TextBox = By.name("email");
    By RegisterButton = By.xpath("//button[@title='Register']");

    //WebElement
    WebElement FirstName_TextBoxElement;
    WebElement LastName_TextBoxElement;
    WebElement Password_TextBoxElement;
    WebElement ConfirmPassword_TextBoxElement;
    WebElement Email_TextBoxElement;
    WebElement RegisterButtonElement;


    //Methods
    public void EnterFirstName (String value)
    {
        FirstName_TextBoxElement = driver.findElement(FirstName_TextBox);
        SendText(FirstName_TextBoxElement,value);
    }
    public void EnterLastName (String value)
    {
        LastName_TextBoxElement = driver.findElement(LastName_TextBox);
        SendText(LastName_TextBoxElement,value);
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
    public void EnterConfirmPassword (String value)
    {
        ConfirmPassword_TextBoxElement = driver.findElement(ConfirmPassword_TextBox);
        SendText(ConfirmPassword_TextBoxElement,value);
    }
    public void ClickOnRegisterButton ()
    {
        RegisterButtonElement = driver.findElement(RegisterButton);
        Clicking(RegisterButtonElement);
    }
}
