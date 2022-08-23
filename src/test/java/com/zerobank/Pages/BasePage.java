package com.zerobank.Pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
