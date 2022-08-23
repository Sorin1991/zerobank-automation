package com.zerobank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(xpath = "//a[.='Add New Payee']")
    public WebElement addNewPayee;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignForency;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement selectCurrency;

    @FindBy(xpath = "//input[@id='pc_amount']")
    public WebElement amountOfCurrencyToBuy;

    @FindBy(xpath = "//input[@id='purchase_cash']")
    public WebElement foreignCurrencyPurchaseButton;

}
