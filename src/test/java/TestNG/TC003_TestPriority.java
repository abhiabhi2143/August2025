package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_TestPriority {
  @Test( priority=2)
  public void test1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
  }
  @Test(priority=1)
  public void test2() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://chatgpt.com/");
  }
  @Test(priority=3)
  public void test3() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://tutorialsninja.com/");
  }
}
