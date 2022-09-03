package com.zerobank.StepDefinition;

import com.zerobank.Pages.DashboardPage;
import com.zerobank.Pages.Login_Page;
import com.zerobank.Pages.OnlineBankingPage;
import com.zerobank.Pages.AccountSummeryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
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
    AccountSummeryPage accountSummeryPage =new AccountSummeryPage();


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        login_page.login();

    }
    @When("the user click on Savings link on the Account Summary page")
    public void the_user_click_on_savings_link_on_the_account_summary_page() {
        dashboardPage.onlineBanking.click();
        onlineBankingPage.accountSummary.click();
        accountSummeryPage.savingPage1.click();



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
       // account.selectByVisibleText("Savings");
        account.getFirstSelectedOption();
        String expectedResult = "Savings";
        String actualResult = account.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult,expectedResult);

    }

    @When("user click on ONLINE BANKING")
    public void user_click_on_online_banking() {
        dashboardPage.onlineBanking.click();

    }
    @And("the user click on Account Summary")
    public void the_user_click_on_account_summary() {
        accountSummeryPage.accountSummary.click();


    }
    @And("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_brokerage_link_on_the_account_summary_page() {
        accountSummeryPage.brokeragePage.click();

    }
    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_brokerage_selected() {
        Select account = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='aa_accountId']")));


        String expectedResult = "Brokerage";
        String actualResult = account.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult,expectedResult);


    }






}
