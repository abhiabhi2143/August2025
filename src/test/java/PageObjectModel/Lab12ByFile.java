package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12ByFile {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		Properties prob=new Properties();

		FileInputStream fis=new FileInputStream("C:\\Eclipse\\August2025\\configuration\\Lab12config.property");

		prob.load(fis);

		String url=prob.getProperty("url");

		String email=prob.getProperty("email");

		String password=prob.getProperty("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
	}

}
