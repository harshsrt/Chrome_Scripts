package Firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver-v0.13.0-win32\\geckodriver.exe");
        //Define the Webdriver for Browser i.e. Firefox
        WebDriver driver = new FirefoxDriver();
         
        //Open the URL (Website)
  driver.get("http://www.gmail.com");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(By.id("Email")).sendKeys("harsh.harsh17");
  driver.findElement(By.id("next")).click();
  Thread.sleep(5000);
  driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("srt");
  driver.findElement(By.id("signIn")).click();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
  driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
	
  




	}	

}
