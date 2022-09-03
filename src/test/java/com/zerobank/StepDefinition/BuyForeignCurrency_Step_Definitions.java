package com.zerobank.StepDefinition;

import com.github.javafaker.Faker;
import com.zerobank.Pages.DashboardPage;
import com.zerobank.Pages.Login_Page;
import com.zerobank.Pages.OnlineBankingPage;
import com.zerobank.Pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.List;

public class BuyForeignCurrency_Step_Definitions {

        Login_Page loginpage = new Login_Page();
        DashboardPage dashboardPage = new DashboardPage();
        OnlineBankingPage onlineBankingPage = new OnlineBankingPage();
        PayBillsPage payBillsPage = new PayBillsPage();
        Faker faker = new Faker();


    @Given("user accesses the Purchase foreign currency cash tab")
    public void user_accesses_the_purchase_foreign_currency_cash_tab() {

        loginpage.login();
        dashboardPage.onlineBanking.click();
        onlineBankingPage.payBills.click();
        payBillsPage.purchaseForeignForency.click();
    }

    @When("user clicks the dropdown to see the available currencies")
    public void user_clicks_the_dropdown_to_see_the_available_currencies() {

        payBillsPage.selectCurrency.click();

    }

    @Then("user see the below currency type available")
    public void user_see_the_below_currency_type_available(List<String> expectedCurrencies) {

        Select select = new Select(payBillsPage.selectCurrency);

        List<WebElement>currencyDropdownElements = select.getOptions();

        List<String> actualCurrencies = new ArrayList<>();

        for (WebElement each : currencyDropdownElements) {
            actualCurrencies.add(each.getText());
        }

        Assert.assertEquals(expectedCurrencies,actualCurrencies);

    }


    @When("user enters the amount to be purchased")
    public void user_enters_the_amount_to_be_purchased() {

        payBillsPage.amountOfCurrencyToBuy.sendKeys("100");

    }

    @When("user click the purchase button")
    public void user_click_the_purchase_button() {

        payBillsPage.foreignCurrencyPurchaseButton.click();

    }

    @Then("user receives the message {string}")
    public void user_receives_the_message(String string) {

        Alert alert = Driver.getDriver().switchTo().alert();

       //System.out.println("alert.getText() = " + alert.getText());

        String expectedAlertText = "Please, ensure that you have filled all the required fields with valid values.";
        String actualAlerttext = alert.getText();

        Assert.assertEquals(expectedAlertText,actualAlerttext);



    }

    @When("user selects the currency to be purchased")
    public void user_selects_the_currency_to_be_purchased() {

        Select select = new Select(payBillsPage.selectCurrency);

        List<WebElement>currencyDropdownElements = select.getOptions();

        select.selectByIndex(faker.number().numberBetween(1, currencyDropdownElements.size()-1));

    }

}
