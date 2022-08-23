package com.zerobank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBankingPage extends BasePage{

    @FindBy(id = "account_summary_link")
    public WebElement accountSummary;

    @FindBy(id = "account_activity_link")
    public WebElement accountActivity;

    @FindBy(id = "transfer_funds_link")
    public WebElement transferFunds;

    @FindBy(id = "pay_bills_link")
    public WebElement payBills;

    @FindBy(id = "money_map_link")
    public WebElement myMoneyMap;

    @FindBy(id = "online_statements_link")
    public WebElement onlineStatements;



}
