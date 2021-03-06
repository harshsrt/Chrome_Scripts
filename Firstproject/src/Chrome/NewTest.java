package Chrome;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://products.office.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
	
			verifyLinkActive(url);
			
		}
		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
      try 
      {
      	
         URL url = new URL(linkUrl);
         
         HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
         
         httpURLConnect.setConnectTimeout(500);
         
         httpURLConnect.connect();
         
         if(httpURLConnect.getResponseCode()==200)
         {
             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
          }
        if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
         {
             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
          }
        SoftAssert assertion=new SoftAssert();
        assertion.assertEquals(httpURLConnect.getResponseCode(),200);
        assertion.assertAll();
       
      } catch (Exception e) {
    	 
    	  
    	 
      }
      
      
  } 
	@Test
	  public void pagetitle()
	  {
		WebDriver driver = new ChromeDriver();
		String actual=driver.getTitle();
		String expected="Microsoft Office | Productivity Tools for Home";
		Assert.assertEquals(actual, expected);
	  }
  }

