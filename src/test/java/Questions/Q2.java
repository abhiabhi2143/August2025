package Questions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Q2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login");
	  
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  
	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	  
	  WebElement ele=driver.findElement(By.xpath("//*[@id=\"content\"]/div/h4"));
	  if(ele.isDisplayed())
	  {
		  System.out.println("LOGIN SUCCESSFUL");
		  
	  }
	  else
	  {
		  System.out.println("login not successful");
	  }
  }
}
