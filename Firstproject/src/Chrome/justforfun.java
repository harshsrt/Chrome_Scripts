package Chrome;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class justforfun {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://products.office.com/en-in/office-365-personal");
		WebElement main= driver.findElement(By.xpath("//div[@role='main']"));
      //  System.out.println(main.findElements(By.xpath("//body//a").size()) ; 
        List<WebElement> alllinks = main.findElements(By.tagName("a"));
		 int count = alllinks.size();
		 
		List<String> links = new ArrayList<String>();
		
		for(WebElement x:alllinks)
		{
			
			System.out.println(x.getText());
		
			
			}
		}
		
		
        }
	
