import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class ContactUs {

    public String firstName = "test";
    public String lastName = "venturedive";
    public String email = "humaira.pasha@venturedive.com";
    public String phoneNumber = "03218529696";
    public String message = "test message";
    public String inquiryOptions = "Removals enquiry";
    public static ChromeDriver driver;
    public static ContactUsObjects contactUs;


    @Before
    public void launchBrowser ()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Humaira Pasha\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humaira Pasha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://qa.bystored.com/contact-us");

    }

    @Test
    public void contactUs () throws InterruptedException {

        contactUs = new ContactUsObjects(driver);
        contactUs.enterInformation(firstName,lastName,email,phoneNumber);
        contactUs.selectInquiry(inquiryOptions);
        contactUs.enterMessage(message);
        contactUs.submitInformation();
        Thread.sleep(90000);
        contactUs.close();



    }

    @After
   public void closeBrowser()
    {
        driver.quit();
    }

}
