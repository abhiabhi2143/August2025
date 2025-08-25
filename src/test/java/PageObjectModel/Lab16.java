package PageObjectModel;


import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.opencsv.exceptions.CsvException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab16 {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
  @Test(dataProvider = "dp")
  public void f(String firstname,String lastname,String email, String phno, String password, String password1) throws InterruptedException {
	  	String title=driver.getTitle();
		System.out.println("The Title is:"+title);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		driver.findElement(By.linkText("Register")).click();
		String rtitle=driver.findElement(By.xpath("//*[@id='content']/h1")).getText();
		if(rtitle.equals("Register Account"))
		{
			System.out.println("title is matched");
		}
		else
		{
			System.out.println("title is not matched");
		}
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("telephone")).sendKeys(phno);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirm")).sendKeys(password1);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		
	
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() throws IOException, CsvException, SAXException, ParserConfigurationException {
  String[][] data1=new String[1][6];
  
  		File file = new File(projectpath+"\\XmlUserDetails.xml");
  
  		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
  		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
   
  		Document doc = dBuilder.parse(file);
  		doc.getDocumentElement().normalize();
   
  		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
   
  		NodeList nList = doc.getElementsByTagName("user");
   
		  for (int i = 0; i < nList.getLength(); i++) 
		  {
		       Node node = nList.item(i);
		   
		       if (node.getNodeType() == Node.ELEMENT_NODE) 
		       {
		           Element element = (Element) node;
		   
		          data1[i][0] = element.getElementsByTagName("firstname").item(0).getTextContent();
		          data1[i][1] = element.getElementsByTagName("lastname").item(0).getTextContent();
		          data1[i][2] = element.getElementsByTagName("email").item(0).getTextContent();
		          data1[i][3] = element.getElementsByTagName("phno").item(0).getTextContent();
		          data1[i][4] = element.getElementsByTagName("password").item(0).getTextContent();
		          data1[i][5] = element.getElementsByTagName("password1").item(0).getTextContent();
		          
		           System.out.println("firstname: " +  data1[i][0]);
		           System.out.println("lastname: " +  data1[i][1]);
		           System.out.println("email: " +  data1[i][2]);
		           System.out.println("phno: " +  data1[i][3]);
		           System.out.println("password: " +  data1[i][4]);
		           System.out.println("password1: " +  data1[i][5]);
		           
		       }
		  }
		   
		  return data1;
    }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
