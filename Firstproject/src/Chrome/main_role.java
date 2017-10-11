package Chrome;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_role {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   		WebDriver driver = new ChromeDriver();
	   	   driver.manage().window().maximize();
	              //Open the URL (Website)
	        driver.get("https://products.office.com/en-us/compare-all-microsoft-office-products?tab=1");
	        WebElement main= driver.findElement(By.xpath("//div[@role='main']"));
	        System.out.println(main.findElements(By.tagName("a")).size()) ; 
	        List<WebElement> mainlink = main.findElements(By.tagName("a"));
	        for(WebElement x:mainlink){
	        	System.out.println(x.getAttribute("href")+"  $  "+x.getAttribute("ms.title")+" $ "+x.getAttribute("class"));
	       if( x.getAttribute("class").contains("mscom"))
	       {
	    	   System.out.println("Has link control");
	       
	       }else{
	    	   System.out.println("does not have link control");
	       
	       
	       }
	        	
	        }
	        
	        
	}

}
