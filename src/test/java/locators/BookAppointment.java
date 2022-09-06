package locators;

import org.openqa.selenium.By;

public interface BookAppointment {

    String name ="Zeydin";
    String email ="zeydin.toprak@hotmail.com";
    String phone = "532532532";
    String date = "12/12/2121";
    String smilecode = "412";
    String message = "I have no message";

    By lBookAppointment = By.xpath("//a[text()='Book Appointment ']");
    By lName = By.id("name");
    By lEmail = By.id("email");
    By lPhone = By.id("phone");
    By lDate = By.id("datepicker");
    By lSmileCode = By.cssSelector("input[placeholder='Do You Have a Unique Smile Promo Code?']");
    By lDosyaSec = By.cssSelector("div[class='form-group']  input[type='file']");
    By lMessage = By.id("textarea");
    By lSendMessageButton = By.xpath("//button[text()='send us message']");
    By lMessageSent = By.xpath("(//p[text()='Your message has been sent.'])[3]");
}
