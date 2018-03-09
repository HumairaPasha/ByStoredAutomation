import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ContactUsObjects {

    WebDriver driver;
    By byFirstName = By.name("firstName");
    By byLastName = By.name("lastName");
    By byEmail = By.name("email");
    By byPhoneNumber = By.name("phoneNumber");
    By byMessage = By.name("message");
    By bySubmit = By.id("contact-us-submit");


    public ContactUsObjects(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterInformation (String fName, String lName, String email, String number)
    {
        driver.findElement(byFirstName).sendKeys(fName);
        driver.findElement(byLastName).sendKeys(lName);
        driver.findElement(byEmail).sendKeys(email);
        driver.findElement(byPhoneNumber).sendKeys(number);
    }

    public void selectInquiry (String option)
    {
        driver.findElement(By.id("selected-parking")).click();
        WebElement allElements = driver.findElement(By.xpath("//*[@id=\"inquiry-options\"]"));
        List<WebElement> countriesList=allElements.findElements(By.tagName("li"));
        for (WebElement li : countriesList) {
            if (li.getText().equals(option)) {
                li.click();
            }
        }
    }

    public void enterMessage(String msg)
    {
        driver.findElement(byMessage).sendKeys(msg);
    }

    public void submitInformation()
    {
        driver.findElement(bySubmit).click();
    }

    public void close()
    {
        driver.findElement(By.xpath("//*[@id=\"contactUsSubmitModal\"]/div/div/div[1]/button")).click();
    }

}
