package com.zerobank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(xpath = "//a[.='Add New Payee']")
    public WebElement addNewPayee;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignForency;

    @FindBy(xpath = "//textarea[@id='np_new_payee_address']")
    public WebElement payeeAddress;

    @FindBy(xpath = "//input[@id='np_new_payee_name']")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_account")
    public WebElement account;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "alert_content")
    public WebElement successMessage;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement selectCurrency;

    @FindBy(xpath = "//input[@id='pc_amount']")
    public WebElement amountOfCurrencyToBuy;

    @FindBy(xpath = "//input[@id='purchase_cash']")
    public WebElement foreignCurrencyPurchaseButton;




}
