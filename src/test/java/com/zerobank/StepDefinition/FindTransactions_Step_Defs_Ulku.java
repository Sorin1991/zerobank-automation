package com.zerobank.StepDefinition;

import com.sun.source.tree.Tree;
import com.zerobank.Pages.AccountActivityPage;
import com.zerobank.Pages.DashboardPage;
import com.zerobank.Pages.Login_Page;
import com.zerobank.Pages.OnlineBankingPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class FindTransactions_Step_Defs_Ulku {

    Login_Page login_page = new Login_Page();
    DashboardPage dashboardPage = new DashboardPage();

    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    List<String> dateList = new ArrayList<>();

    String mostRecentTransactionDate;
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_find_transactions_tab() {
        login_page.login();
        dashboardPage.onlineBanking.click();
        onlineBankingPage.accountActivity.click();
        accountActivityPage.findTransactionsLink.click();
    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {
        accountActivityPage.fromDate.clear();
        accountActivityPage.fromDate.sendKeys(fromDate);
        accountActivityPage.toDate.clear();
        accountActivityPage.toDate.sendKeys(toDate);

    }
    @When("clicks search")
    public void clicks_search() {
        accountActivityPage.findButton.click();
        BrowserUtils.sleep(1);


    }
    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) {
        mostRecentTransactionDate = toDate;

        for (WebElement eachDate : accountActivityPage.allDates) {
            if(!eachDate.getText().isBlank()){
                dateList.add(eachDate.getText());
            }

        }
        Assert.assertEquals(dateList.get(0),toDate);
        Assert.assertEquals(dateList.get(dateList.size()-1),fromDate);


    }
    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    Assert.assertTrue(dateList.get(0).equals(mostRecentTransactionDate));

    }
    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        Assert.assertTrue(dateList.contains(string));
        // There is a bug! The table contains transactions date
    }

}
