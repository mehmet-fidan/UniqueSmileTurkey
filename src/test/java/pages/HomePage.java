package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import utils.Driver;
import utils.ParentClass;

import java.util.List;

public class HomePage extends ParentClass {


    public void homePageTest() {
    //  System.out.println("testng is working");
    //  driver.get(Locators.url);

        List<WebElement> menubar = driver.findElements(locators.HomePage.lHeaderList);

        Actions builder = new Actions(driver);

        Action action1;


        for (int i = 0; i < menubar.size(); i++) {
            menubar = driver.findElements(locators.HomePage.lHeaderList);
            if (i != 0) {
                menubar.get(i).click();
                sleep(2000);
                driver.navigate().back();
                //   driver.navigate().refresh();
            }

            // for (WebElement webElement : menubar) {

            //     action1 = builder.moveToElement(webElement).build();
            //     action1.perform();
            //     sleep(2000);
            // }
        }

    }



    public void quitDriver() {
        Driver.quitDriver();
    }

}
