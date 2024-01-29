import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TV_Page extends Main {

    //Constructor
    public TV_Page(WebDriver driver) {
        super(driver);
    }

    //By
    private By AddToWishList_LG_TV = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a");

    //WebElement
    private WebElement AddToWishList_LG_TV_Element;

    //Methods
    public void AddToWishList_LG_TV ()
    {
        AddToWishList_LG_TV_Element = driver.findElement(AddToWishList_LG_TV);
        Clicking(AddToWishList_LG_TV_Element);
    }
}
