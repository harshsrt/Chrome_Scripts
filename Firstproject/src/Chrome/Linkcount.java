package Chrome ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linkcount {

       public static void main(String[] args) {
    	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   	   
              //Open the URL (Website)
        driver.get("https://products.office.com");
       
       
	  
        //Identify the number of Link on webpage and assign into Webelement List 
        List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
       
        // Count the total Link list on Web Page 
        int linkListCount = allLinkElements.size();
               
        //Print the total count of links on webpage
            
        System.out.println("Total Number of link on webpage = "  + linkListCount);
    
        for(int i=0;i<linkListCount;i++)
        {
        	if(allLinkElements.get(i).getText() == null | (allLinkElements.get(i).getText()).equalsIgnoreCase("")|allLinkElements.get(i).getAttribute("href") == null | allLinkElements.get(i).getCssValue("font-size")==null | allLinkElements.get(i).getCssValue("font-size")==null | allLinkElements.get(i).getCssValue("font-size") == null
                    | allLinkElements.get(i).getCssValue("font-weight")== null | allLinkElements.get(i).getCssValue("text-align")== null 
                    | allLinkElements.get(i).getCssValue("font-family")== null | allLinkElements.get(i).getCssValue("color")== null);
        
                  else
                  
                	  System.out.println(allLinkElements.get(i).getText()+" $ "+allLinkElements.get(i).getAttribute("id")+" $ "+allLinkElements.get(i).getAttribute("ms.title")+" $ "+allLinkElements.get(i).getAttribute("class"));
                  
                  
                  
                  
                  
        
        
                  } }}


       
        
        
        
       
        
       
       
        
     
       
       

