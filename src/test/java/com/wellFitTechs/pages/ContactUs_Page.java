package com.wellFitTechs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_Page extends HomePage {
    public ContactUs_Page() {
    }

        @FindBy( xpath = "//button[@id='btn-switch-zipcode']")
        public WebElement changeButton;

        @FindBy(xpath = "//input[@aria-label='Zip Code']")
        public WebElement zipcodeBox;


        @FindBy(xpath = "//button[@id='836a21d5-2950-f79a-94d2-d0e19ddf239e']")
        public WebElement submitButton;

        @FindBy(xpath="//button[@id='41c60b40-db40-f3d6-6a3c-977817d2f0f0']")
        public WebElement cancelButton;


        @FindBy(xpath = "//img[@alt='Citi']")
        public WebElement CitiLogoButton;



}
