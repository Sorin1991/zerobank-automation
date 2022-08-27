package com.zerobank.StepDefinition;

import com.zerobank.Pages.DashboardPage;
import com.zerobank.Pages.Login_Page;
import com.zerobank.Pages.OnlineBankingPage;
import com.zerobank.Pages.SavingsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigation_Step_Defs {

    Login_Page login_page = new Login_Page();
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();
    DashboardPage dashboardPage =new DashboardPage();
    SavingsPage savingsPage =new SavingsPage();


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        login_page.login();

    }
    @When("the user click on Savings link on the Account Summary page")
    public void the_user_click_on_savings_link_on_the_account_summary_page() {
        dashboardPage.onlineBanking.click();
        onlineBankingPage.accountSummary.click();
        savingsPage.savingPage1.click();



    }
    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {
        String actualAccountActivityPageTitle = Driver.getDriver().getTitle();
        String expectedAccountActivityPageTitle = "Zero - Account Activity";
     //   System.out.println(actualAccountActivityPageTitle);
        Assert.assertEquals(actualAccountActivityPageTitle,expectedAccountActivityPageTitle);

    }
    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_savings_selected() {

        Select account = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='aa_accountId']")));
        account.selectByVisibleText("Savings");

    }




}
