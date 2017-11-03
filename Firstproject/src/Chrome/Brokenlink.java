package Chrome;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Brokenlink {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://test.create.powerapps.com/studio/#");
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys("v-mastha@microsoft.com");
		driver.findElement(By.id("cred_password_inputtext")).sendKeys("nov@2017");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"loginMessage\"]/a/p")).click();
		
				
		
		driver.findElement(By.id("passwordInput")).sendKeys("nov@2017");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.className("template-item-start-button-text")).click();
		driver.findElement(By.xpath("//*[@id=\"rootBody\"]/div[1]/div[2]/div[2]/button")).click();
		
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
        } catch (Exception e) {
           
        }
    } 
	
	
	 
 




	}


