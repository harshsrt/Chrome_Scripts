package Chrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class http {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   		WebDriver driver = new ChromeDriver();
	   	   driver.manage().window().maximize();
         
        driver.get("https://products.office.com/en-us/compare-all-microsoft-office-products?tab=1");
        WebElement main= driver.findElement(By.xpath("//div[@role='main']"));
        System.out.println(main.findElements(By.tagName("a")).size()) ; 
        List<WebElement> mainlink = main.findElements(By.tagName("a"));
        for(WebElement x:mainlink){
        	System.out.println(x.getAttribute("href"));
       if( x.getAttribute("href").contains("fwlink"))
       {
    	   System.out.println("yes");
       
       }else{
    	   System.out.println("no");
       
		  
		  }
		  
	
        }
        }
}
		  
		  
	

			 
			  
		  
		  
		  
		 

	


