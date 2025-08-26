package Questions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q5 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	  
	  Alert al=driver.switchTo().alert();
	  System.out.println(al.getText());
	  al.accept();
	  
  }
}
