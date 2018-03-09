import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wizard {

    public static ChromeDriver driver;
    public static Step1Objects booking;


    @Before
    public void launchBrowser ()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Humaira Pasha\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humaira Pasha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://qa.bystored.com");
        driver.manage().window().maximize();

    }


    @Test
    public void bookStorageUnit() throws InterruptedException {
        booking = new Step1Objects(driver);
        booking.bookNow();
        booking.bookingDetails();
    }



    @After
    public void closeBrowser()
    {
       // driver.quit();
    }




}
