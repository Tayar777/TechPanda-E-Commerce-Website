import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product1_Page extends Main {    // --------- PRODUCT ONE = SONY XPERIA ---------- //

    //Constructor
    public Product1_Page(WebDriver driver) {
        super(driver);
    }

    //By
    private By PriceArea = By.xpath("//*[@id=\"product-price-1\"]/span");

    //WebElement
    private WebElement PriceAreaElement;







}
