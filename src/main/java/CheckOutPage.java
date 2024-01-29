import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends Main{
    // Constructor
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    //By
    private By ContinueButton_BillingInformation = By.xpath("//*[@id=\"billing-buttons-container\"]/button");
    private By ContinueButton_ShippingMethod = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    private By MoneyOrder_RadioButton = By.xpath("//input[@id='p_method_checkmo']");
    private By ContinueButton_PaymentInformation = By.xpath("//*[@id=\"payment-buttons-container\"]/button");
    private By PlaceOrderButton = By.xpath("//button[@title='Place Order']");

    //WebElement
    private WebElement ContinueButtonElement_BillingInformation;
    private WebElement ContinueButtonElement_ShippingMethod;
    private WebElement MoneyOrderElement_RadioButton;
    private WebElement ContinueButtonElement_PaymentInformation;
    private WebElement PlaceOrderButtonElement;

    //Methods
    public void ClickOnContinueButton1 ()
    {
        ContinueButtonElement_BillingInformation = driver.findElement(ContinueButton_BillingInformation);
        Clicking(ContinueButtonElement_BillingInformation);
    }
    public void ClickOnContinueButton3()
    {
        ContinueButtonElement_ShippingMethod = driver.findElement(ContinueButton_ShippingMethod);
        Clicking(ContinueButtonElement_ShippingMethod);
    }
    public void SelectMoneyOrder_RadioButton()
    {
        MoneyOrderElement_RadioButton = driver.findElement(MoneyOrder_RadioButton);
        Clicking(MoneyOrderElement_RadioButton);
    }
    public void ClickOnContinueButton4()
    {
        ContinueButtonElement_PaymentInformation = driver.findElement(ContinueButton_PaymentInformation);
        Clicking(ContinueButtonElement_PaymentInformation);
    }
    public void ClickOnPlaceOrderButton()
    {
        PlaceOrderButtonElement = driver.findElement(PlaceOrderButton);
        Clicking(PlaceOrderButtonElement);
    }
}
