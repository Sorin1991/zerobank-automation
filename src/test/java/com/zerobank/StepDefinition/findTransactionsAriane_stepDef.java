package com.zerobank.StepDefinition;

import com.zerobank.Pages.AccountActivityPage;
import com.zerobank.Pages.DashboardPage;
import com.zerobank.Pages.Login_Page;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findTransactionsAriane_stepDef {
    Login_Page login_page = new Login_Page();
    DashboardPage dashboardPage = new DashboardPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("user has logged in, gone on Checking Account Activity then on Find Transactions")
    public void userHasLoggedInGoneOnCheckingAccountActivityThenOnFindTransactions() {
        login_page.login();
        WebDriverWait waitObject = new WebDriverWait(Driver.getDriver(), 5);
        waitObject.until(ExpectedConditions.
                elementToBeClickable(dashboardPage.accountActivityLink));
        dashboardPage.accountActivityLink.click();
        accountActivityPage.findTransactionsTab.click();

    }


    @When("the user enters description ONLINE")
    public void user_enters_description_ONLINE() {

        //<input type="text" id="aa_description" name="description" autocomplete="off">
        accountActivityPage.descriptionField.sendKeys("ONLINE");

        System.out.println(" first when");
    }


    @And("clicks search")
    public void clicksSearch() {
        accountActivityPage.findButton.click();

    }

    @Then("results table should only show descriptions containing “ONLINE”")
    public void resultsTableShouldOnlyShowDescriptionsContainingONLINE() {
        BrowserUtils.sleep(6);

        System.out.println("listOfDescriptionSize: " + accountActivityPage.filteredTransactionsDescriptionCells.size());
        for (WebElement descriptionCell : accountActivityPage.filteredTransactionsDescriptionCells) {
            System.out.println("descriptionCell = " + descriptionCell.getText());
        }
        for (WebElement eachDescriptionCell : accountActivityPage.filteredTransactionsDescriptionCells) {
            // String DescriptionText = eachDescriptionCell.getText();
           // System.out.println("eachDescriptionCell.getText() = " + eachDescriptionCell.getText());
            Assert.assertTrue(eachDescriptionCell.getText().contains("ONLINE"));


        }


    }


    @When("the	user	enters	description	“OFFICE”")
    public void theUserEntersDescriptionOFFICE() {
    }


    @Then("results	table	should	only	show	descriptions	containing	“OFFICE”")
    public void resultsTableShouldOnlyShowDescriptionsContainingOFFICE() {
    }

    @But("results	table	should	not show	descriptions	containing	“OFFICE”")
    public void resultsTableShouldNotShowDescriptionsContainingOFFICE() {
    }

}
