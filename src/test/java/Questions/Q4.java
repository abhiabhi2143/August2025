package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Q4 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	  
	  WebElement we=driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select"));
	  Select sle=new Select(we);
	  //sle.selectByIndex(2);
	  sle.selectByVisibleText("Two");
	  
  }
}
