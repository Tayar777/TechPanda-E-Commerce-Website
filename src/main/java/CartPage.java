import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Main {

    //Constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }

    //By
    private By Quantity = By.xpath("//input[@title='Qty']");
    private By UpdateQuantityButton = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button");
    private By EmptyCartLink = By.xpath("//button[@title='Empty Cart']");
    private By Country_DropDown = By.xpath("//select[@name='country_id']");
    private By State_DropDown = By.xpath("//select[@id='region_id']");
    private By ZIP_TextBox = By.xpath("//input[@id='postcode']");
    private By Estimate_LinkText = By.xpath("//button[@title='Estimate']");
    private By CheckoutButton = By.xpath("//li[@class='method-checkout-cart-methods-onepage-bottom']");
    private By Check_EstimateRadioButton = By.xpath("//input[@type='radio']");
    private By UpdateTotalButton = By.xpath("//button[@title='Update Total']");
    private By Price = By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span");
    private By DiscountCode_TextBox = By.xpath("//input[@id='coupon_code']");
    private By DiscountCode_ApplyButton = By.xpath("//*[@id=\"discount-coupon-form\"]/div/div/div/div/button[1]/span/span");


    //WebElement
    private WebElement QuantityElement;
    private WebElement UpdateQuantityButtonElement;
    private WebElement EmptyCartLinkElement;
    private WebElement Country_DropDownElement;
    private WebElement State_DropDownElement;
    private WebElement ZIP_TextBoxElement;
    private WebElement Estimate_LinkTextElement;
    private WebElement CheckoutButtonElement;
    private WebElement Check_EstimateRadioButtonElement;
    private WebElement UpdateTotalButtonElement;
    private WebElement PriceElement;
    private WebElement DiscountCode_TextBoxElement;
    private WebElement DiscountCode_ApplyButtonElement;


    //Methods
    public void EnterQuantity (String value)
    {
        QuantityElement = driver.findElement(Quantity);
        SendText(QuantityElement, value);
    }
    public void ClearQuantity ()
    {
        QuantityElement = driver.findElement(Quantity);
        ClearText(QuantityElement);
    }
    public void ClickUpdate_ForQuantity ()
    {
        UpdateQuantityButtonElement = driver.findElement(UpdateQuantityButton);
        Clicking(UpdateQuantityButtonElement);
    }
    public void ClickOnEmptyCartLink ()
    {
        EmptyCartLinkElement = driver.findElement(EmptyCartLink);
        Clicking(EmptyCartLinkElement);
    }
    public void SelectCountry (String Country)
    {
        Country_DropDownElement = driver.findElement(Country_DropDown);
        SelectDropDown_ByText(Country_DropDownElement,Country);
    }
    public void SelectState (String State)
    {
        State_DropDownElement = driver.findElement(State_DropDown);
        SelectDropDown_ByText(State_DropDownElement,State);
    }
    public void EnterZIP(String ZIP)
    {
        ZIP_TextBoxElement = driver.findElement(ZIP_TextBox);
        SendText(ZIP_TextBoxElement,ZIP);
    }
    public void ClickEstimate()
    {
        Estimate_LinkTextElement = driver.findElement(Estimate_LinkText);
        Clicking(Estimate_LinkTextElement);
    }
    public void ClickOnCheckoutButton ()
    {
        CheckoutButtonElement = driver.findElement(CheckoutButton);
        Clicking(CheckoutButtonElement);
    }
    public void Select_EstimateRadioButton ()
    {
        Check_EstimateRadioButtonElement = driver.findElement(Check_EstimateRadioButton);
        Clicking(Check_EstimateRadioButtonElement);
    }
    public void ClickOnUpdateTotalButton ()
    {
        UpdateTotalButtonElement = driver.findElement(UpdateTotalButton);
        Clicking(UpdateTotalButtonElement);
    }
    public void EnterDiscountCode (String Code)
    {
        DiscountCode_TextBoxElement = driver.findElement(DiscountCode_TextBox);
        SendText(DiscountCode_TextBoxElement,Code);
    }
    public void ClickApplyOnDiscountCode ()
    {
        DiscountCode_ApplyButtonElement = driver.findElement(DiscountCode_ApplyButton);
        Clicking(DiscountCode_ApplyButtonElement);
    }
}
