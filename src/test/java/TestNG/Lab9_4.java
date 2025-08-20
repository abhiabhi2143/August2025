package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab9_4 {
	@Parameters("browser")
  @Test
  public void f(String browser) throws InterruptedException {
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome"))
		  {
			  System.out.println("this is chrome test");
			  WebDriverManager.chromedriver().setup();
			  driver =new ChromeDriver();
			  driver.get("https://tutorialsninja.com/demo/index.php");
			  driver.findElement(By.linkText("Desktops")).click();
			  driver.findElement(By.linkText("Mac (1)")).click();
			  WebElement sort=driver.findElement(By.id("input-sort"));
			  Select sle=new Select(sort);
			  sle.selectByIndex(1);
			  driver.findElement(By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']")).click();
			  driver.findElement(By.name("search")).sendKeys("mobile");
			  driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.id("input-search")).clear();
			  driver.findElement(By.name("description")).click();
			  driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
			  
			  driver.findElement(By.name("search")).sendKeys("Monitor");
			  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
				
				//Add the step after Click on 'Mac' where verify the 'Mac' heading

				 /*String title1= driver.getTitle();
				  if(title1.equals("Mac")) {
					  System.out.println("Mac is verified");
				  }
				  else {
					  System.out.println("Mac is not verified");
				  }*/
			  
			  Assert.assertEquals(driver.getTitle(),"Search - Monitor");
			  if(driver.getTitle().equals("Search - Monitor"))
			  {
				  System.out.println("title is matched");
				  Assert.assertTrue(true);
				  
			  }
			  else
			  {
				  System.out.println("title is not matched");
				  Assert.assertFalse(true);
			  }
		  }
		  else if(browser.equalsIgnoreCase("firefox"))
		  {
			  System.out.println("this is firefox test");
			  WebDriverManager.firefoxdriver().setup();
			  driver =new FirefoxDriver();
			  driver.get("https://tutorialsninja.com/demo/index.php");
			  driver.findElement(By.linkText("Desktops")).click();
			  driver.findElement(By.linkText("Mac (1)")).click();
			  WebElement sort=driver.findElement(By.id("input-sort"));
			  Select sle=new Select(sort);
			  sle.selectByIndex(1);
			  driver.findElement(By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']")).click();
			  driver.findElement(By.name("search")).sendKeys("mobile");
			  driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.id("input-search")).clear();
			  driver.findElement(By.name("description")).click();
			  driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
			  
			  driver.findElement(By.name("search")).sendKeys("Monitor");
			  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
				
				//Add the step after Click on 'Mac' where verify the 'Mac' heading

				 /*String title1= driver.getTitle();
				  if(title1.equals("Mac")) {
					  System.out.println("Mac is verified");
				  }
				  else {
					  System.out.println("Mac is not verified");
				  }*/
			  
			  Assert.assertEquals(driver.getTitle(),"Search - Monitor");
			  if(driver.getTitle().equals("Search - Monitor"))
			  {
				  System.out.println("title is matched");
				  Assert.assertTrue(true);
				  
			  }
			  else
			  {
				  System.out.println("title is not matched");
				  Assert.assertFalse(true);
			  }
		  }
		  else if(browser.equalsIgnoreCase("edge"))
		  {
			  System.out.println("this is edge test");
			  WebDriverManager.edgedriver().setup();
			  driver =new EdgeDriver();
			  driver.get("https://tutorialsninja.com/demo/index.php");
			  driver.findElement(By.linkText("Desktops")).click();
			  driver.findElement(By.linkText("Mac (1)")).click();
			  WebElement sort=driver.findElement(By.id("input-sort"));
			  Select sle=new Select(sort);
			  sle.selectByIndex(1);
			  driver.findElement(By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']")).click();
			  driver.findElement(By.name("search")).sendKeys("mobile");
			  driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.id("input-search")).clear();
			  driver.findElement(By.name("description")).click();
			  driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
			  
			  driver.findElement(By.name("search")).sendKeys("Monitor");
			  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
				
				//Add the step after Click on 'Mac' where verify the 'Mac' heading

				 /*String title1= driver.getTitle();
				  if(title1.equals("Mac")) {
					  System.out.println("Mac is verified");
				  }
				  else {
					  System.out.println("Mac is not verified");
				  }*/
			  
			  Assert.assertEquals(driver.getTitle(),"Search - Monitor");
			  if(driver.getTitle().equals("Search - Monitor"))
			  {
				  System.out.println("title is matched");
				  Assert.assertTrue(true);
				  
			  }
			  else
			  {
				  System.out.println("title is not matched");
				  Assert.assertFalse(true);
			  }
		  }
		
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
