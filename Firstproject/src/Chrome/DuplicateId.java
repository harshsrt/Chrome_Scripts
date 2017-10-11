package Chrome;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DuplicateId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open the URL (Website)
		driver.get("http://google.com");

		List<String> alldupId = new ArrayList<String>();

		// Identify the number of Link on webpage and assign into Webelement
		// List
		List<WebElement> allLinkElements = driver.findElements(By.xpath("//*[@id]"));

		// Count the total Link list on Web Page
		int linkListCount = allLinkElements.size();
		System.out.println("No of web element with ID  " + linkListCount);

		List<String> allId = new ArrayList<String>();

		for (WebElement x : allLinkElements) {
			// System.out.println(x.getAttribute("id"));
			allId.add(x.getAttribute("id"));

		}

		Set<String> store = new HashSet<>();

		for (String ids : allId) {
			if (store.add(ids) == false) {
				System.out.println("Found an element having duplicate id as  :-  " + ids);

				alldupId.add(ids);
			}

		}
		if (alldupId.size() == 0) {
			System.out.println("Hurray !! No duplicate id found");

		} else
		// if size of list is not null, duplicate ids found
		{
			System.out.println("Duplicate id found ! Please report a bug");
		}
		
		driver.quit();
	}
}
