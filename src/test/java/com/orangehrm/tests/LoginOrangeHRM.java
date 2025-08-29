package com.orangehrm.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.Login_PageFactory;
import com.orangehrm.utilities.ExcelUtils;
import com.orangehrm.utilities.Screenshot;

public class LoginOrangeHRM extends BaseTest {
    
    static String projectpath = System.getProperty("user.dir");

    @Test(dataProvider="logindata", enabled=false)
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
    @Test
    public void verifyQ1() throws IOException
    {
    	  driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  driver.get("https://www.google.com");
	  	  test = extent.createTest("verify the title : ");
	  	  String title=driver.getTitle();
	  	  System.out.println(title);
	  	  if(title.equalsIgnoreCase("Google"))
	  	  {
	  		  test.pass("Login successful and title matched : "+title);
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "Login_Failed_");
	  		  test.fail("Login unsuccessful. Title not matched : "+title).addScreenCaptureFromPath(screenpath);
	  	  }
    }
    
    @Test(enabled=false)
    public void verifyQ2() throws IOException
    {
    	  driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  driver.get("https://the-internet.herokuapp.com/login");
	  	test = extent.createTest("Login with the user: ");
	  	  
	  	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  	  
	  	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  	  
	  	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	  	  
	  	  WebElement ele=driver.findElement(By.xpath("//*[@id=\"content\"]/div/h4"));
	  	  if(ele.isDisplayed())
	  	  {
	  		  test.pass("LOGIN SUCCESSFUL");
	  		  
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "Login_Failed_");
	  		  test.fail("login not successful").addScreenCaptureFromPath(screenpath);
	  	  }
    }
    
    @Test(enabled=false)
    public void verifyQ3() throws IOException
    {
    	  driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  test = extent.createTest("Search for laptops and retrieve the first 5 laptops ");
	  	  driver.get("https://www.amazon.in");
	  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	  //driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();
	  	  
	  	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
	  	  driver.findElement(By.id("nav-search-submit-button")).click();
	  	  
	  	  List<WebElement> laptop=driver.findElements(By.xpath("//div[@role='listitem' and @data-component-type='s-search-result']"));
	  	  int c=0;
	  	  for(WebElement lap:laptop)
	  	  {
	  		  c++;
	  		  System.out.println(lap.getText());
	  		  System.out.println();
	  		  if(c==5)
	  		  {
	  			  break;
	  		  }
	  	  }
	  	  if(c<=5)
	  	  {
	  		  test.pass("Search for the first 5 laptops is successful");
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "Search for the first 5 laptops is failed");
	  		  test.fail("Search for the first 5 laptops is unsuccessful").addScreenCaptureFromPath(screenpath);
	  	  }
    }
    
    @Test(enabled=false)
    public void verifyQ4() throws IOException
    {
    	  driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	  	  test=extent.createTest("Handling the select dropdown ");
	  	  WebElement we=driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select"));
	  	  Select sle=new Select(we);
	  	  //sle.selectByIndex(2);
	  	  sle.selectByVisibleText("Two");
	  	  if(we.isEnabled())
	  	  {
	  		  test.pass("selected the 2 nd option in the dropdown");
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "select the 2 nd option in the dropdown is failed");
	  		  test.fail("dropdown not handled").addScreenCaptureFromPath(screenpath);
	  	  }
    }
    
    @Test(enabled=false)
    public void verifyQ5() throws IOException
    {
    	  driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  test=extent.createTest("Handling alerts");
	  	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  	  
	  	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	  	  
	  	  Alert al=driver.switchTo().alert();
	  	  System.out.println(al.getText());
	  	  if(al.getText().equalsIgnoreCase("I am a JS Alert"))
	  	  {
	  		  
	  		  al.accept();
	  		  test.pass("Alert handled");
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "handling alert is failed");
	  		  test.fail("Alert not handled").addScreenCaptureFromPath(screenpath);
	  	  }
	  	  
    }
    
    @Test(enabled=false)
    public void verifyQ6() throws IOException
    {
    	  driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  test=extent.createTest("Handling the checkboxes");
	  	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  	  
	  	  WebElement c1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	  	  WebElement c2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
	  	  
	  	  if(c1.isSelected())
	  	  {
	  		  System.out.println("c1 is already selected");
	  	  }
	  	  else
	  	  {
	  		  c1.click();
	  	  }
	  	  if(c2.isSelected())
	  	  {
	  		  System.out.println("c2 is already selected");
	  	  }
	  	  else
	  	  {
	  		  c2.click();
	  	  }
	  	  
	  	  if(c1.isSelected() && c2.isSelected())
	  	  {
	  		  test.pass("Checkbox handling is successful");
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "handling checkboxes is failed");
	  		  test.fail("Checkbox handling is unsuccessful").addScreenCaptureFromPath(screenpath);
	  	  }
    }
    
    @Test(enabled=false)
    public void verifyQ7() throws IOException
    {
    	  driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  test=extent.createTest("Retrieving the email based on the name in the table");
	  	  driver.get("https://the-internet.herokuapp.com/tables");
	  	  
	  	  List<WebElement> table =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
	  	  
	  	  for(int i=0;i<table.size();i++)
	  	  {
	  		  System.out.println(table.get(i).getText());
	  	  }
	
	  	  String jemail =driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[3]")).getText();
	  	  System.out.println(jemail);
	  	  if(jemail.equals("jdoe@hotmail.com"))
	  	  {
	  		  test.pass("Retrieving the email based on the name is successful");
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "Retrieving the email is failed");
	  		  test.fail("Retrieving the email based on the name is unsuccessful").addScreenCaptureFromPath(screenpath);
	  	  }
    }
    
    @Test(enabled=false)
    public void verifyQ8() throws InterruptedException, IOException
    {
    	driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  driver.get("https://the-internet.herokuapp.com/windows");
	  	  navigateUrl("https://the-internet.herokuapp.com/windows");
	  	  test=extent.createTest("Switching windows");
	  	  driver.findElement(By.linkText("Click Here")).click();
	  	  
	  	  Set<String> windowId= driver.getWindowHandles();
	  	  Thread.sleep(3000);
	  	  List<String> winId=new ArrayList<>(windowId);
	  	  System.out.println(winId.size());
	  	  driver.switchTo().window(winId.get(1));
	  	  
	  	  String text=driver.findElement(By.xpath("/html/body/div/h3")).getText();
	  	  System.out.println(text);
	  	  if(text.equalsIgnoreCase("New Window"))
	  	  {
	  		  driver.switchTo().window(winId.get(0));
	  		  test.pass("Switching windows is successful");
	  	  }
	  	  else
	  	  {
	  		  String screenpath=Screenshot.Capture(driver, "Switching windows is failed");
	  		  test.fail("Switching windows is unsuccessful").addScreenCaptureFromPath(screenpath);
	  	  }
    }
    
    @Test(enabled=false)
    public void verifyQ9() throws InterruptedException
    {
    	 driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  Thread.sleep(3000);
	  	  driver.get("https://www.wikipedia.org");
	  	//navigateUrl("https://www.wikipedia.org");
	  	  
	  	  TakesScreenshot ts=(TakesScreenshot)driver;
	  	  
	  	  File f=ts.getScreenshotAs(OutputType.FILE);
	  	  File ff=new File(System.getProperty("user.dir")+"\\Project\\homepage.png");
	  	  f.renameTo(ff);
    }
    
    @DataProvider
    public Object[][] logindata() throws IOException {
        String excelpath = projectpath + "\\src\\test\\resources\\Testdata\\data.xlsx";
        return ExcelUtils.getData(excelpath, "Sheet1");
    }
}
