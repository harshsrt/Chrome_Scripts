package Chrome ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tooltip {

       public static void main(String[] args) {
    	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   	   
              //Open the URL (Website)
        driver.get("https://products.office.com/en-us/compare-all-microsoft-office-products?tab=1");
       
        //Identify the number of Link on webpage and assign into Webelement List 
        // List<WebElement> tooltip=driver.findElements(By.id("pmg-tooltip-home-1"));
       
       
        // for(WebElement x: tooltip)
        // {
        	 
        	// String t=x.getAttribute("aria-label");
        		//	 System.out.println(t);
       //  }
        
        WebElement element=driver.findElement(By.className("caption pmg-txt-white-space-normal"));
        	
       String text=element.getText();
       
       System.out.println(text);

        
      
       
        
        }
        }

     
       
        
        
        
       
        
       
      

