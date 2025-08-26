package Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  
	  String title=driver.getTitle();
	  System.out.println(title);
	  
  }
  
}
