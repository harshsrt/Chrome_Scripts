package Chrome;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinktestng {

public static void main(String[] args) {
 
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
List<String> brokenLinks = getBrokenURLs(driver,"http://products.office.com",2,new ArrayList<String>());
for(String brokenLink : brokenLinks){
System.out.println(brokenLink);
}
 
 
}
public static List<String> getBrokenURLs(WebDriver driver, String appURL, int depth, List<String> links){
{
driver.navigate().to(appURL);
System.out.println("Depth is: " + depth);
while(depth > 0){
List<WebElement> linkElems = driver.findElements(By.tagName("a"));
for(WebElement linkElement : linkElems)
if(!links.contains(linkElement))
links.add(linkElement.getAttribute("href"));
for(String link : links)
getBrokenURLs(driver, link, --depth, links);
}
}
return getBrokenURLs(driver, links, new ArrayList<String>()) ;
}
 
public static List<String> getBrokenURLs(WebDriver driver, List<String> links, List<String> brokenLinks){
{
for(String link : brokenLinks){
driver.navigate().to(link);
if(driver.getTitle().contains("404 Page Not Found")){
brokenLinks.add(link);
}
}
}
return brokenLinks ;
}
}
