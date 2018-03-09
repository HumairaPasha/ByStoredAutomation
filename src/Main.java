import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Main {

    public static By loginButtonHomepage = By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a") ;;
    //public static By loginButtonHomepage = By.cssSelector("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a");
    public static By inputField = By.cssSelector("#lst-ib");
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Humaira Pasha\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humaira Pasha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://qa.bystored.com/contact-us");

        driver.findElement(By.id("selected-parking")).click();

        WebElement allElements = driver.findElement(By.xpath("//*[@id=\"inquiry-options\"]"));
        List<WebElement> countriesList=allElements.findElements(By.tagName("li"));
        for (WebElement li : countriesList) {
            if (li.getText().equals("Removals enquiry")) {
                li.click();
            }
        }






    }
}
