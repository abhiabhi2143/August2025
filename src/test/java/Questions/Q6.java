package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q6 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
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
	  
  }
}
