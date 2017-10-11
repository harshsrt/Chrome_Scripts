package Chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   		WebDriver driver = new ChromeDriver();
	   	   
	              //Open the URL (Website)
	        driver.get("https://news.google.com/news/headlines?hl=en-IN&ned=in");
	        driver.manage().window().maximize();
	       
	        //Identify the number of Link on webpage and assign into Webelement List 
	        List<WebElement> allLinkElements = driver.findElements(By.tagName("img"));
	       
	        // Count the total Link list on Web Page 
	        int linkListCount = allLinkElements.size();
	        System.out.println("No of Images :"+linkListCount);
	               
	        //Print the total count of links on webpage
	       for(int i =0;i<linkListCount;i=i+1)
	       {
	    	   System.out.println("Link   :"+i+ "  "+allLinkElements.get(i).getAttribute("src"));
	       }

	}

}
