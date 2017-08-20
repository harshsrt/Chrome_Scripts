package PageValidator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.testng.annotations.Test;

public class PageSummary {
	static int i;
	@Test
	public void Summary() throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 FileInputStream fis=new FileInputStream("C:/Selenium/Testdata/Global.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("PageSummary");
		s.createRow(0);
		
		long start=System.currentTimeMillis();
		driver.get(methods.URL);
		long finish=System.currentTimeMillis();
		long Total_Time=(finish-start)/1000;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000);");
		
		driver.findElement(By.id("feedbackSectionCloseBtn")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Show all')]")).click();
		
		WebElement main= driver.findElement(By.xpath("//main[@role='main']"));
		 List<WebElement> links =main.findElements(By.tagName("a"));
		 List<WebElement> image =main.findElements(By.tagName("img"));
		 
		 List<String > alllinks=new ArrayList<String>();
		 for( i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				if(ele.getText().length()!=0)
				{
				String url=ele.getAttribute("href");
		
				alllinks.add(url);
				}
			}
			int alllink=alllinks.size();
			 System.out.println("Page URL :"+driver.getCurrentUrl());
			 System.out.println("Page Title :"+driver.getTitle());
			// System.out.println("Page description :"+ driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"));
			 System.out.println("Total page load time : "+Total_Time +"seconds");
			 System.out.println("Total links on page :"+alllink);
			 System.out.println("Total Image on page :"+image.size());
			 s.createRow(4);
			 s.getRow(4).createCell(0).setCellValue("Page URL : "+driver.getCurrentUrl());
			 s.createRow(5);
			 s.getRow(5).createCell(0).setCellValue("Page Title : "+driver.getTitle());
			 s.createRow(6);
			 s.getRow(6).createCell(0).setCellValue("Total page load time : "+Total_Time +"seconds");
			 s.createRow(7);
			 s.getRow(7).createCell(0).setCellValue("Total links on page : "+alllink);
			 s.createRow(8);
			 s.getRow(8).createCell(0).setCellValue("Total Image on page : "+image.size());
				
			 
			 FileOutputStream fos=new FileOutputStream("C:/Selenium/Testdata/Global.xlsx");
		  		wb.write(fos);
				
	}
	}

