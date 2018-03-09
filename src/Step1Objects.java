import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Step1Objects {

    WebDriver driver;

    public Step1Objects(WebDriver driver) {
        this.driver = driver;
    }

    public void bookNow() {
        driver.findElement(By.xpath("//*[@id=\"storageplanslider\"]/div[2]/div/div[1]/div/div/button[1]")).click();
    }

    public void bookingDetails() throws InterruptedException , StaleElementReferenceException {
        driver.findElement(By.xpath("//*[@id=\"search-address\"]")).sendKeys("sw66af");
        Thread.sleep(10000);

        WebElement elements = driver.findElement(By.xpath("//*[@id=\"search-results-container\"]/ul"));

        List<WebElement> addressList = elements.findElements(By.tagName("li"));
     /*   for (WebElement li : addressList) {
            if (li.getText().equals("1 Rowallan Road London, SW6 6AF")) {
                li.click();
            }*/

        addressList.get(0).click();
        //System.out.println(""+addressList.get(0).getText());
        Thread.sleep(500);
        // WebElement elements2 = driver.findElement(By.xpath("//*[@id=\"search-results-container\"]/ul"));
        Thread.sleep(1000);
        WebElement elements2 = driver.findElement(By.xpath("//*[@id=\"search-results-container\"]/ul"));
        List<WebElement> addressList2 = elements2.findElements(By.tagName("li"));

        System.out.println(addressList2.get(0).getText());
        addressList2.get(0).click();
        // driver.findElement(By.xpath("//*[@id=\"stairs\"]/span")).click();


      /*  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        Actions actions = new Actions(driver);

        actions.moveToElement(element).click().perform();
        WebElement elementStairInfo = driver.findElement(By.xpath("//*[@id=\"stairs\"]/ul"));
        List<WebElement> stairsInfo = driver.findElements(By.tagName("li"));
        actions.moveToElement(elementStairInfo);
        stairsInfo.get(0).click();
*/


        WebElement element = driver.findElement(By.xpath("//*[@id=\"stairs\"]"));

        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        driver.findElement(By.xpath("//*[@id=\"stairs\"]")).click();
        WebElement elementStairInfo = driver.findElement(By.xpath("//*[@id=\"stairs\"]/ul"));
        List<WebElement> stairsInfo = elementStairInfo.findElements(By.tagName("li"));
        stairsInfo.get(0).click();

        driver.findElement(By.xpath("//*[@id=\"assistance\"]")).click();
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        WebElement elementPackingInfo = driver.findElement(By.xpath("//*[@id=\"assistance\"]/ul"));
        List<WebElement> packingInfo = elementPackingInfo.findElements(By.tagName("li"));
        packingInfo.get(0).click();
        Thread.sleep(11000);
        WebElement table = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/div/table"));
        List<WebElement> columns = table.findElements(By.tagName("td"));

        for (WebElement cell : columns) {


            if(cell.getText().equals("12"))

            {
                cell.click();
                break;
            }

            }

            Thread.sleep(2000);

       // WebDriverWait wait3 = new WebDriverWait(driver, 10);
      //  wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[@id=\\\"afternoonTime\\\"]\"")));
        WebElement timeslot = driver.findElement(By.xpath("//*[@id=\"afternoonTime\"]"));
        List<WebElement> timeslotSelection = timeslot.findElements(By.tagName("li"));
        System.out.println(""+ timeslotSelection.get(0).getText());
        timeslotSelection.get(0).click();

        driver.findElement(By.xpath("//*[@id=\"stage1\"]")).click();


        }
    }

