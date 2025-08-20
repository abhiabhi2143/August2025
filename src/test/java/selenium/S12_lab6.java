package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S12_lab6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		WebElement sort=driver.findElement(By.id("input-limit"));
		Select sle=new Select(sort);
		List<WebElement> elec=sle.getOptions();
		for(int i=0;i<elec.size();i++)
		{
			System.out.println("drop downs is "+elec.get(i).getText());
		}
		System.out.println();
		
		sle.selectByIndex(1);	
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Specification")).click();
		
		List<WebElement> spec=driver.findElements(By.id("tab-specification"));
		for(int i=0;i<spec.size();i++)
		{
			System.out.println(spec.get(i).getText());
		}
		System.out.println();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
		
		driver.findElement(By.name("search")).click();
		driver.findElement(By.name("search")).sendKeys("Mobile");
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		
		driver.findElement(By.name("description")).click();
		
		driver.findElement(By.id("button-search")).click();
		
		driver.findElement(By.linkText("HTC Touch HD")).click();
		
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("3");
		
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		
		driver.findElement(By.id("cart-total")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
	}

}
