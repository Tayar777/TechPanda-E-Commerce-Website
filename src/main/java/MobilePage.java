import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePage extends Main{

    //Constructor
    public MobilePage(WebDriver driver) {
        super(driver);
    }

    //By
    private By SortBy_DropDown = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select");
    private By Product1 = By.xpath("//a[@title='Sony Xperia']");
    private By Product1_AddToCart = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button");
    private By Product3_AddToCart = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button");
    private By Product1_AddToCompare = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a");
    private By Product2_AddToCompare = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a");
    private By CompareButton = By.xpath("//button[@title='Compare']");
    private By CompareClearAllButton = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/a");

    //WebElement
    private WebElement SortBy_DropDownElement;
    private WebElement Product1_Element;
    private WebElement Product1_AddToCartElement;
    private WebElement Product3_AddToCartElement;
    private WebElement Product1_AddToCompareElement;
    private WebElement Product2_AddToCompareElement;
    private WebElement CompareButtonElement;
    private WebElement CompareClearAllButtonElement;


    //Methods
    public void ClickOnSortBy_Name ()
    {
        SortBy_DropDownElement = driver.findElement(SortBy_DropDown);
        SelectDropDown_ByIndex(SortBy_DropDownElement, 1);
    }

    public void ClickOnProduct1 ()
    {
        Product1_Element = driver.findElement(Product1);
        Clicking(Product1_Element);
    }
    public void AddProduct1ToCart ()
    {
        Product1_AddToCartElement = driver.findElement(Product1_AddToCart);
        Clicking(Product1_AddToCartElement);
    }
    public void AddProduct1ToCompare ()
    {
        Product1_AddToCompareElement = driver.findElement(Product1_AddToCompare);
        Clicking(Product1_AddToCompareElement);
    }
    public void AddProduct2ToCompare ()
    {
        Product2_AddToCompareElement = driver.findElement(Product2_AddToCompare);
        Clicking(Product2_AddToCompareElement);
    }
    public void ClickOnCompare ()
    {
        CompareButtonElement = driver.findElement(CompareButton);
        Clicking(CompareButtonElement);
    }
    public void ClickOnCompareClearAll ()
    {
        CompareClearAllButtonElement = driver.findElement(CompareClearAllButton);
        Clicking(CompareClearAllButtonElement);
    }
    public void AddProduct3ToCart ()
    {
        Product3_AddToCartElement = driver.findElement(Product3_AddToCart);
        Clicking(Product3_AddToCartElement);
    }


}
