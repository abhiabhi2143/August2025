package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageFactory {
    
    WebDriver driver;
    
    // ✅ Constructor
    public Login_PageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // important!
    }

    // Elements
    @FindBy(name="username")
    WebElement uname;

    @FindBy(name="password")
    WebElement pword;

    @FindBy(xpath="//button[@type='submit']")
    WebElement loginbutton;

    // Actions
    public void enterusername(String username) {
        uname.sendKeys(username);
    }

    public void enterpassword(String password) {
        pword.sendKeys(password);
    }

    public void clickonlogin() {
        loginbutton.click();
    }
}
