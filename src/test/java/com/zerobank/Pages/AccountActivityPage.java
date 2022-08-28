package com.zerobank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionsTab;

    //elements after clicking the 'find transaction' tab:

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findButton;

    @FindBy(id = "aa_description")
    public WebElement descriptionField;

    // @FindAll({@FindBy(xpath = "//table[@class='table table-condensed table-hover']/tbody/tr/td[2]")})
    //  public List<WebElement> allDescriptionCells;

    // @FindBy(xpath = "//table[@class='table table-condensed table-hover']/tbody/tr/td[2]")
    // public List<WebElement> allDescriptionCells;

    //ABOVE PATHS DO NOT FOCUS ON FILTERED TRANSACTIONS.INSTEAD THEY BRING UP A LIST OF 5 ELEMENTS: INSTEAD OF 2 FOR ONLINE AND 1 FOR OFFICE

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[2]")
    public List<WebElement> filteredTransactionsDescriptionCells;


}
