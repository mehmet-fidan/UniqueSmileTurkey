package pages;

import locators.BookAppointment;
import org.testng.Assert;
import utils.ParentClass;

public class BookAppointmentPage extends ParentClass {

    public void bookingTest() {
        clickTo(BookAppointment.lBookAppointment);
        sleep(2000);
        sendkeys(BookAppointment.lName, BookAppointment.name);
        sendkeys(BookAppointment.lEmail,BookAppointment.email);
        sendkeys(BookAppointment.lPhone, BookAppointment.phone);
        sendkeys(BookAppointment.lDate, BookAppointment.date);
        sendkeys(BookAppointment.lSmileCode, BookAppointment.smilecode);
        sleep(3000);
        //  clickTo(locators.BookAppointment.lDosyaSec);
        //  driver.findElement(Locators.lDosyaSec).sendKeys("C:\\Users\\esk\\Desktop\\dicle\\basvuru\\ben ve elif.jpg",Keys.ENTER);
        sendkeys(BookAppointment.lMessage, BookAppointment.message);
        clickTo(BookAppointment.lSendMessageButton);

        Assert.assertTrue(driver.findElement(BookAppointment.lMessageSent).getText().contains("has been sent"));

        sleep(3000);
    }
}
