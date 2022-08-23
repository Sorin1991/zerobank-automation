package com.zerobank.Pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage {


  @FindBy(id = "user_login")
  public WebElement username;

  @FindBy(id = "user_password")
  public WebElement password;

  @FindBy(xpath = "//input[@name='submit']")
  public WebElement submitButton;

  public void login() {

    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    signInButton.click();

    BrowserUtils.sleep(1);

    username.sendKeys("username");
    password.sendKeys("password");
    submitButton.click();
    Driver.getDriver().navigate().back();

  }
}

