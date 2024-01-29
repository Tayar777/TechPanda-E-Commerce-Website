import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Set;

public class Main {

    //Attributes
    protected WebDriver driver;

    //Constructors
    public Main (WebDriver driver)
    {
        this.driver=driver;
    }

    //Methods
    public static void Clicking (WebElement element)
    {
        element.click();
    }
    public static void SendText (WebElement element, String value)
    {
        element.sendKeys(value);
    }
    public static void ClearText (WebElement element)
    {
        element.clear();
    }
    public static void SelectDropDown_ByIndex (WebElement element,int index)
    {
        Select dropDown = new Select(element);
        dropDown.selectByIndex(index);
    }
    public static void SelectDropDown_ByText (WebElement element,String text)
    {
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }
    public void AddWait ()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void GetElementText (String ElementName,String xPath)
    {
        WebElement element = driver.findElement(By.xpath(xPath));
        ElementName = element.getText();
    }
    public void SwitchToTheNewWindow () {
        String MainWindow = driver.getWindowHandle();
        Set<String> AllWindows = driver.getWindowHandles();
        for (String s : AllWindows) {
            if (!s.equals(MainWindow)) {
                driver.switchTo().window(s);
                System.out.println(s);
            }
        }
    }
    public void ClickOnAlert ()
    {
        driver.switchTo().alert().accept();
    }


/* Tricks
   Element.SendKeys(Keys.Control + "s");       this perform "control s" = save
   search for AutoIt
   Element.SendKeys(""D:\software testing\slides\OOP (Java) .pdf"");      To upload a file to a site from the upload button send the path as a keys
 */


}
