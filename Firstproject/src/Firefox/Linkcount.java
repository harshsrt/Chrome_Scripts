package Firefox;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcount {

	public static void main(String[] args)
	{
		 
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver-v0.13.0-win32\\geckodriver.exe");
        //Define the Webdriver for Browser i.e. Firefox
        WebDriver driver = new FirefoxDriver();
         
        //Open the URL (Website)
  driver.get("http://google.com");
 
  //Identify the number of Link on webpage and assign into Webelement List 
  List<WebElement> allLinkElements = driver.findElements(By.tagName("a"));
 
  // Count the total Link list on Web Page 
  int linkListCount = allLinkElements.size();
         
 
 
  System.out.println(+linkListCount);
  for(WebElement x:allLinkElements) 
  {
		 
	 
	 System.out.println(x.getText()+"   "+x.getAttribute("id"));
	

	 
  }
  
  
 
  
  //Close the Broswer
 driver.close();


 
 }
}



	


