package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q8 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/windows");
	  
	  driver.findElement(By.linkText("Click Here")).click();
	  
	  Set<String> windowId= driver.getWindowHandles();
	  Thread.sleep(3000);
	  List<String> winId=new ArrayList<>(windowId);
	  System.out.println(winId.size());
	  driver.switchTo().window(winId.get(1));
	  
	  String text=driver.findElement(By.xpath("/html/body/div/h3")).getText();
	  System.out.println(text);
	  
	  driver.switchTo().window(winId.get(0));
	  
	  
	  
	  
	  
  }
}
