import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrdersPage extends Main{
    //Constructor
    public MyOrdersPage(WebDriver driver) {
        super(driver);
    }

    //By
    private By ViewOrder_LinkText = By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/span/a[1]");
    private By ReOrder_LinkText = By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[2]/td[6]/span/a[2]");
    private By PrintOrder_LinkText = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]");
    private By Destination_DropDown = By.xpath("//*[@id=\"destinationSelect\"]//print-preview-settings-section/div");
    private By PrintButton = By.xpath("//cr-button[@class='action-button']");

    //WebElement
    private WebElement ViewOrder_LinkTextElement;
    private WebElement ReOrder_LinkTextElement;
    private WebElement PrintOrder_LinkTextElement;
    private WebElement Destination_DropDownElement;
    private WebElement PrintButtonElement;


    //Methods
    public void ClickOnViewOrder ()
    {
        ViewOrder_LinkTextElement = driver.findElement(ViewOrder_LinkText);
        Clicking(ViewOrder_LinkTextElement);
    }
    public void ClickOnReOrder ()
    {
        ReOrder_LinkTextElement = driver.findElement(ReOrder_LinkText);
        Clicking(ReOrder_LinkTextElement);
    }
    public void ClickOnPrintOrder ()
    {
        PrintOrder_LinkTextElement = driver.findElement(PrintOrder_LinkText);
        Clicking(PrintOrder_LinkTextElement);
    }
    public void SelectDestinationToPrintPDF()
    {
        Destination_DropDownElement = driver.findElement(Destination_DropDown);
        SelectDropDown_ByIndex(Destination_DropDownElement,1);
    }
    public void ClickOnPrintButton ()
    {
        PrintButtonElement = driver.findElement(PrintButton);
        Clicking(PrintButtonElement);
    }
}
