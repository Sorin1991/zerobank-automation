package com.zerobank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummeryPage extends BasePage {

    @FindBy(id = "account_summary_link")
    public WebElement accountSummary;

    @FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=1']")
    public WebElement savingPage1;

    @FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=3']")
    public WebElement savingPage2;

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement brokeragePage;



}
