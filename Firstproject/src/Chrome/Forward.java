package Chrome ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Forward {

       public static void main(String[] args) {
    	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   	   
              //Open the URL (Website)
        driver.get("https://www.google.com");
       
        //Identify the number of Link on webpage and assign into Webelement List 
        List<WebElement> allLinkElements = driver.findElements(By.tagName("a"));
       
        // Count the total Link list on Web Page 
        int linkListCount = allLinkElements.size();
               
        //Print the total count of links on webpage
            
        System.out.println("Total Number of link on webpage = "  + linkListCount);
        List<String> allId = new ArrayList<String>();
        for (WebElement x : allLinkElements) {
			//System.out.println(x.getAttribute("id"));
			allId.add(x.getAttribute("href"));

		}

		
        List<String> allIdsClone=new ArrayList<String>();
		for (String ids : allId) {
			//if (ids.matches("^(http?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"));				{
				if(ids.contains("http://"))
			{
					allIdsClone.add(ids);
				}System.out.println(ids);
					}
				
			
        
         
        	
         

        
      
       
        
        }
        }

     
       
        
        
        
       
        
       
      
