package Chrome ;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class xpath {

       @SuppressWarnings("unused")
	public static void main(String[] args) 
       {
    	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   	   
              //Open the URL (Website)
        driver.get("https://products.office.com/en-us/compare-all-microsoft-office-products?tab=1");
       
     

		// Identify the number of Link on webpage and assign into Webelement
		// List
		List<WebElement> allLinkElements = driver.findElements(By.xpath("//a[contains(@href,'forward')]"));

		// Count the total Link list on Web Page
		int linkListCount = allLinkElements.size();
		System.out.println("No of web element with ID  " + linkListCount);

		//List<String> allId = new ArrayList<String>();

		for (WebElement x : allLinkElements) {
			System.out.println(x.getAttribute("src")+"  "+x.getAttribute("role"));
			
}
}
}

