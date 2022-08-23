package com.zerobank.StepDefinition;

import com.zerobank.Pages.BasePage;
import com.zerobank.Pages.DashboardPage;
import com.zerobank.Pages.Login_Page;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_step_definitions {


    Login_Page loginpage = new Login_Page();
    DashboardPage dashboard = new DashboardPage();


    @When("User is on the login-page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("http://zero.webappsecurity.com/index.html");
        loginpage.signInButton.click();

    }
    @When("User enters the username and password")
    public void user_enters_the_username_and_password() {

        loginpage.username.sendKeys("username");
        loginpage.password.sendKeys("password");
        loginpage.submitButton.click();

        Driver.getDriver().navigate().back();

    }
    @Then("User lands on the dashboard")
    public void user_lands_on_the_dashboard() {
        //System.out.println("dashboard.usernameCheck.getText() = " + dashboard.usernameCheck.getText());
        Assert.assertEquals("username", dashboard.usernameCheck.getText());

    }
}
