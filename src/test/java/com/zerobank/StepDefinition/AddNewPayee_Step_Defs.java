package com.zerobank.StepDefinition;

import com.zerobank.Pages.DashboardPage;
import com.zerobank.Pages.Login_Page;
import com.zerobank.Pages.OnlineBankingPage;
import com.zerobank.Pages.PayBillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayee_Step_Defs {
    Login_Page login_page = new Login_Page();
    DashboardPage dashboardPage = new DashboardPage();
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();

    PayBillsPage payBillsPage = new PayBillsPage();

    String newPayeeName;

    @Given("Add New Payee tab")
    public void add_new_payee_tab() {
        login_page.login();
        dashboardPage.onlineBanking.click();
        onlineBankingPage.payBills.click();
        payBillsPage.addNewPayee.click();

    }
    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> payeeInfo) {
        newPayeeName = payeeInfo.get("Payee Name");
        payBillsPage.payeeName.sendKeys(payeeInfo.get("Payee Name"));
        payBillsPage.payeeAddress.sendKeys(payeeInfo.get("Payee Address"));
        payBillsPage.account.sendKeys(payeeInfo.get("Account"));
        payBillsPage.payeeDetails.sendKeys(payeeInfo.get("Payee details"));
        payBillsPage.addButton.click();

    }
    @Then("The new payee {string} was successfully created should be displayed")
    public void the_new_payee_was_successfully_created_should_be_displayed(String string) {
        string = newPayeeName;

        Assert.assertTrue(payBillsPage.successMessage.isDisplayed());
        Assert.assertTrue(payBillsPage.successMessage.getText().contains(string));

    }
}
