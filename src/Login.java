import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

    public String email = "humaira.pasha@venturedive.com";
    public String password = "venture";
    public static ChromeDriver driver;
    public static LoginObjects login;


    @Before
    public void launchBrowser ()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Humaira Pasha\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humaira Pasha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://qa.bystored.com");

    }

    @Test
    public void login ()
    {

        login = new LoginObjects(driver);
        login.clickHomeLoginButton();

        login.inputLoginDetails(email,password);
        login.clickLoginButton();


    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }



}
