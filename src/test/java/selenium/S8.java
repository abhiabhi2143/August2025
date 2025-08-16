package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");		
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.id("input-firstname")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("mahesh");
		driver.findElement(By.id("input-firstname")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-lastname")).sendKeys("mahi");
		driver.findElement(By.id("input-lastname")).sendKeys(Keys.TAB);
		driver.findElement(By.name("email")).sendKeys("alkadavflkj@gmail.com");
		driver.findElement(By.id("input-email")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-telephone")).sendKeys("1234578965");
		driver.findElement(By.id("input-telephone")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-password")).sendKeys("admin@123");
		driver.findElement(By.id("input-password")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-confirm")).sendKeys("admin@123");
		driver.findElement(By.id("input-confirm")).sendKeys(Keys.TAB);
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("newsletter")).sendKeys(Keys.TAB);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		
	}

}