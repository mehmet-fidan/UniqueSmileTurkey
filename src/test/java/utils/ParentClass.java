package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ParentClass {

    public WebDriver driver;
    public WebDriverWait wait;

    public ParentClass() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void gotoHomePage(String url) {
        driver.get(url);
    }

    public void clickTo(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendkeys(By loctaor, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loctaor)).sendKeys(text);
    }

    public void scroll(int scrollValue) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //  js.executeScript("arguments[0].scrollIntoView(true);", locator);
        // js.executeScript("arguments[0].scrollIntoView();",locator);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");  //bottom of page
        //   js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");  //top of page
        js.executeScript("window.scrollBy(0," + scrollValue + ")");
    }

    public int randomNum(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }

    public void selectOptions(By locator) {

        WebElement orderKategorie = driver.findElement(locator);

        Select select = new Select(orderKategorie);
        // select.selectByValue("rating");
        //  select.selectByIndex(7);

        List<WebElement> options = select.getOptions();
        int random = randomNum(options.size());
        System.out.println(options.size());
        System.out.println(random);
        System.out.println(options.get(random).getText());
        options.get(random).click();

        sleep(2000);
    }

    public void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
