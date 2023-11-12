package com.wellFitTechs.steps;

import com.github.javafaker.Faker;
import com.wellFitTechs.pages.ContactUs_Page;
import com.wellFitTechs.pages.HomePage;
import com.wellFitTechs.utility.BrowserUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ContactUs_StepDef {

    HomePage homePage= new HomePage();


    @Given("user is on contact us page")
    public void user_is_on_contact_us_page() {
        BrowserUtil.waitFor(5);
        HomePage.contactUsModule.click();
        BrowserUtil.waitFor(5);

    }

    ContactUs_Page contactUsPage=new ContactUs_Page();
    @Given("user enters name {string}")
    public void user_enters_name(String nameValue) {
        ContactUs_Page.nameInput.sendKeys(nameValue);

    }

    @And("user enters company name {string}")
    public void userEntersCompanyName(String companyValue) {
        ContactUs_Page.companyInput.sendKeys(companyValue);
        BrowserUtil.waitFor(5);

    }


    @And("user enters invalid phone number {string}")
    public void userEntersInvalidPhoneNumber(String phoneNumber) {
        Faker faker=new Faker();
        ContactUs_Page.phoneNumberInput.sendKeys(phoneNumber);
        BrowserUtil.waitFor(5);
    }

    @Then("user enters invalid email address {string}")
    public void userEntersInvalidEmailAddress(String emailValue) {
        ContactUs_Page.emailAddressValue.sendKeys(emailValue);
        BrowserUtil.waitFor(5);

    }

    @Then("user selects {string} from the options")
    public void userSelectsFromTheOptions(String checkBox) {
        BrowserUtil.waitFor(5);
        ContactUs_Page.solutionChoice.click();
        BrowserUtil.waitFor(5);
    }



    @Then("user clicks send button")
    public void user_clicks_send_button() {
        ContactUs_Page.sendButton.click();

    }
    @Then("system should display the error message of your submission failed because of an error")
    public void system_should_display_the_error_message_of_your_submission_failed_because_of_an_error() {

        BrowserUtil.waitFor(5);
        ContactUs_Page.displayMessage.getText();

        Assert.assertFalse("SUCCESS MESSAGE SHOULD NOT BE DISPLAYED" , ContactUs_Page.displayMessage.isDisplayed());
    }



}
