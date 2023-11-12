package com.wellFitTechs.pages;

import com.wellFitTechs.utility.Driver;
import com.wellFitTechs.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//a[@class='elementor-item'][1]")
                public static WebElement contactUsModule;

    }











