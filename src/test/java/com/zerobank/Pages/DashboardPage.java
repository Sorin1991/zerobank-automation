package com.zerobank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{



    @FindBy(xpath = "//a[normalize-space()='username']")
    public WebElement usernameCheck;

    @FindBy(id = "account_activity_link")
    public WebElement accountActivityLink;


}
