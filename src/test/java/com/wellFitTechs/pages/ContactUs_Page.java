package com.wellFitTechs.pages;

import com.wellFitTechs.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs_Page extends HomePage {
    public ContactUs_Page() {

            PageFactory.initElements(Driver.getDriver(), this);
        }

     @FindBy (xpath="//input[@id='form-field-name']")
    public static WebElement nameInput;

    @FindBy(xpath="//input[@id='form-field-field_9bdaa5a']")
    public static WebElement companyInput;

    @FindBy(xpath ="//input[@type='tel']")
    public static WebElement phoneNumberInput;

    @FindBy(xpath = "//input[@type='email'] ")
    public static WebElement emailAddressValue;

    @FindBy(xpath="//input[@value='Dental Plans']")
    public static WebElement solutionChoice;

    @FindBy(xpath = "//button[@type='submit'] ")
    public static WebElement sendButton;

    @FindBy(xpath="//div[@role='alert']")
    public static WebElement displayMessage;
    }




