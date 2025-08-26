package Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q7 {
	WebDriver driver;
  @Test
  public void f() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://the-internet.herokuapp.com/tables");
	  
	  List<WebElement> table =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
	  
	  for(int i=0;i<table.size();i++)
	  {
		  System.out.println(table.get(i).getText());
	  }

	  String jemail =driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[3]")).getText();
	  System.out.println(jemail);
	  
  }
}
