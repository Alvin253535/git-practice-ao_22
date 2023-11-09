

package com.project_name.pages;

import com.project_name.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_O extends BasePage{

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailBox;


    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordBox;


    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;


    public void login(){

        emailBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

}
