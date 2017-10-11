package Chrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testnglinkcount {
	@Test
	public void linkcount()
	{
		
	    	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   		WebDriver driver = new ChromeDriver();
	   	   
	              //Open the URL (Website)
	        driver.get("http://google.com");
	       
	        //Identify the number of Link on webpage and assign into Webelement List 
	        List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
	       
	        // Count the total Link list on Web Page 
	        int linkListCount = allLinkElements.size();
	               
	        //Print the total count of links on webpage
	            
	    
	        System.out.println("Total Number of link on webpage = "  + linkListCount);
	        for(WebElement x:allLinkElements)
	     	   System.out.println(x.getAttribute("id"));      
	        Reporter.log( "Message", true );
	       
	        //Close the Broswer
	       
	}
	
}
