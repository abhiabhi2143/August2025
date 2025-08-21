package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Lab11 {
	WebDriver driver;
	public Lab11(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnDesktop() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Desktops")).click();
		
	}
	public void clickOnMac() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Mac (1)")).click();
	}
	public void clickOnCart() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']")).click();
	}
	public void sort() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		WebElement sort=driver.findElement(By.id("input-sort"));
		  Select sle=new Select(sort);
		  sle.selectByIndex(1);
	}
	public void search() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.name("search")).sendKeys("mobile");
		  driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		  Thread.sleep(3000);
	}
	public void clear() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("input-search")).clear();
	}
	public void clickOnDes() {
		// TODO Auto-generated method stub
		 driver.findElement(By.name("description")).click();
		  driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
	}
	public void search1() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("search")).sendKeys("Monitor");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	}
	public void asserti() {
		// TODO Auto-generated method stub
		Assert.assertEquals(driver.getTitle(),"Search - Monitor");
		  if(driver.getTitle().equals("Search - Monitor"))
		  {
			  System.out.println("title is matched");
			  Assert.assertTrue(true);
			  
		  }
		  else
		  {
			  System.out.println("title is not matched");
			  Assert.assertFalse(true);
		  }
	}
	
	
	
	
}
