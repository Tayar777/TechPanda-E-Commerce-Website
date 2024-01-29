import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage extends Main {
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    //By
    private By ShareWishListButton = By.xpath("//button[@title='Share Wishlist']");
    private By ShareWishList_EmailTextBox = By.xpath("//textarea[@name='emails']");
    private By ShareWishList_MessageTextBox = By.xpath("//textarea[@id='message']");
    private By AddToCartButton = By.xpath("//*[@id=\"item_74713\"]/td[5]/div/button");


    //WebElement
    private WebElement ShareWishListButtonElement;
    private WebElement ShareWishList_MessageTextBoxElement;
    private WebElement ShareWishList_EmailTextBoxElement;
    private WebElement AddToCartButtonElement;


    //Methods
    public void ClickOnShareWishListButton ()
    {
        ShareWishListButtonElement = driver.findElement(ShareWishListButton);
        Clicking(ShareWishListButtonElement);
    }
    public void EnterShareWishList_Message (String value)
    {
        ShareWishList_MessageTextBoxElement = driver.findElement(ShareWishList_MessageTextBox);
        SendText(ShareWishList_MessageTextBoxElement,value);
    }
    public void EnterShareWishList_Email (String value)
    {
        ShareWishList_EmailTextBoxElement = driver.findElement(ShareWishList_EmailTextBox);
        SendText(ShareWishList_EmailTextBoxElement,value);
    }
    public void ClickOnAddToCartButton ()
    {
        AddToCartButtonElement = driver.findElement(AddToCartButton);
        Clicking(AddToCartButtonElement);
    }





}
