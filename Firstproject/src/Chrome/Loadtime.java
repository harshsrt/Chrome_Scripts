package Chrome;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loadtime {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
		long start=System.currentTimeMillis();
        
        driver.get("https://www.google.com");
		long finish=System.currentTimeMillis();
		long Total_Time=(finish-start)/1000;
      System.out.println("Total page load time: "+Total_Time +"seconds");
      if(Total_Time>10)
    	  System.out.println("Page load time is more that expected");
      else
    	  System.out.println("Hurray Its loading quickly ");
    
    	 
      }
         
    }



	


