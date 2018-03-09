import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjects {



    public static By someThing = By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a");
    public static By email = By.xpath("//*[@id=\"email\"]");
    public static By password = By.xpath("//*[@id=\"password\"]");
    public static By loginButton = By.id("btnLoginSubmit");

    WebDriver driver;

    public LoginObjects(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickHomeLoginButton ()
    {
        driver.findElement(someThing).click();

    }

    public void inputLoginDetails (String userName, String pwd)
    {

        driver.findElement(email).sendKeys(userName);
        driver.findElement(password).sendKeys(pwd);

    }

    public void clickLoginButton()
    {

        driver.findElement(loginButton).click();

    }



}
