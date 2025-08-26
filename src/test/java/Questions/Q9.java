package Questions;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q9 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();

	  driver.get("https://www.wikipedia.org");
	  
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  
	  File f=ts.getScreenshotAs(OutputType.FILE);
	  File ff=new File(System.getProperty("user.dir")+"\\Project\\homepage.png");
	  f.renameTo(ff);
	  
	  
  }
}
