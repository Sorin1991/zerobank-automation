package com.zerobank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionsLink;


    @FindBy(id = "aa_fromDate")
    public WebElement fromDate;

    @FindBy(id = "aa_toDate")
    public WebElement toDate;

    @FindBy(xpath = "//button[.='Find']")
    public WebElement findButton;

    @FindAll({
            @FindBy(xpath = "//td[starts-with(.,2012)]")
    })
    public List<WebElement> allDates;

}
