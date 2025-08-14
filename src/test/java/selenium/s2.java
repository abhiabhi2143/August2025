package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("title : "+driver.getTitle());
		
		WebElement search =driver.findElement(By.id("APjFqb"));
		search.sendKeys("Automation testing tools");
		//search.submit();
		search.sendKeys(Keys.ENTER);
		//driver.findElement(By.name("q")).click();
		System.out.println("title : "+driver.getTitle());
		
		
		
		//WE USE sendKeys(Keys.ENTER) or submit() 
	}

}
