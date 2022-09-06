package stepDefinitions;

import io.cucumber.java.en.When;
import pages.BookAppointmentPage;
import pages.HomePage;

public class BookAppointmentStepDef {

   BookAppointmentPage  bookAppointment = new BookAppointmentPage();

    @When("user clicks book appoinment")
    public void userClicksBookAppoinment() {
        bookAppointment.bookingTest();
    }
}
