package com.orangehrm.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.Login_PageFactory;
import com.orangehrm.utilities.ExcelUtils;
import com.orangehrm.utilities.Screenshot;

public class LoginOrangeHRM extends BaseTest {
    
    static String projectpath = System.getProperty("user.dir");

    @Test(dataProvider="logindata")
    public void verifylogin(String username, String password) throws IOException {
        
        // Extent Report Test
        test = extent.createTest("Login with the user: " + username);

        // ✅ Use constructor of Login_pagefactory instead of redeclaring driver
        Login_PageFactory obj = new Login_PageFactory(driver);
        
        obj.enterusername(username);
        obj.enterpassword(password);
        obj.clickonlogin();
        
        String actualtitle = driver.getTitle();
        
        if (actualtitle.equalsIgnoreCase("OrangeHRM")) {   // ✅ fix title
            test.pass("Login Successful and title matched: " + actualtitle);
        } else {
            String screenpath = Screenshot.Capture(driver, "Login_Failed_" + username);
            test.fail("Login Unsuccessful. Title not matched: " + actualtitle)
                .addScreenCaptureFromPath(screenpath);
        }
    }
    
    @DataProvider
    public Object[][] logindata() throws IOException {
        String excelpath = projectpath + "\\src\\test\\resources\\Testdata\\data.xlsx";
        return ExcelUtils.getData(excelpath, "Sheet1");
    }
}
