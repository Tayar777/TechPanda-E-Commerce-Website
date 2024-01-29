import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends Main{
    //Constructor
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    //By
    private By MyOrdersButton = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a");

    //WebElement
    private WebElement MyOrdersButtonElement ;

    //Methods
    public void ClickOnMyOrdersButton ()
    {
        MyOrdersButtonElement = driver.findElement(MyOrdersButton);
        Clicking(MyOrdersButtonElement);
    }




}
