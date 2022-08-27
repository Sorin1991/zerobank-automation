package com.zerobank.Pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SavingsPage extends BasePage {

    @FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=1']")
    public WebElement savingPage1;

    @FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=3']")
    public WebElement savingPage2;



}
