package PageValidator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkStatus {

	static int i;
	@Test
	public  void Linkstatus() throws IllegalStateException, InvalidFormatException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(methods.URL);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000);");
		
		driver.findElement(By.id("feedbackSectionCloseBtn")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Show all')]")).click();
		
		WebElement main= driver.findElement(By.xpath("//main[@role='main']"));
	       // System.out.println(main.findElements(By.tagName("a")).size()) ; 
	        List<WebElement> links =main.findElements(By.tagName("a"));
		
		
		List<String> link = new ArrayList<String>();
		for( i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			
		
			if(ele.getText().length()!=0)
			{
				
				String url=ele.getAttribute("href");
				link.add(url);
			verifyLinkActive(url);
			}
			
		}
		
		System.out.println("Total links are "+link.size());
	}
	
	public static void verifyLinkActive(String linkUrl) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C:/Selenium/Testdata/Global.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("LinkStatus");
		s.createRow(0);
		s.getRow(0).createCell(0).setCellValue("Link Status");
        try 
        {
        	
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()<400)
          {
        	
       
   			String linktext=linkUrl+" - "+httpURLConnect.getResponseMessage()+"  "+httpURLConnect.getResponseCode();
   			
			s.createRow(i+2).createCell(0).setCellValue(linktext);
			
   			
			 System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"  "+httpURLConnect.getResponseCode());
   			
          }
	
           
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
        	  
              String linktext=linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND+"  "+httpURLConnect.getResponseCode();
              s.createRow(i+2).createCell(0).setCellValue(linktext);
              System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"  "+httpURLConnect.getResponseCode());
            }
         
          FileOutputStream fos=new FileOutputStream("C:/Selenium/Testdata/Global.xlsx");
  		wb.write(fos);
  		Assert.assertNotSame(httpURLConnect.getResponseCode(),404);
        } catch (Exception e) {
        	
        }
    } 

	}


