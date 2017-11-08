package Chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class powerapps {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://test.create.powerapps.com/studio/#");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#cred_userid_inputtext")).sendKeys("user1@msprojectsienav1.onmicrosoft.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#cred_password_inputtext")).sendKeys("Building9");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#cred_keep_me_signed_in_checkbox")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#cred_sign_in_button"))).click();
		//WebElement element= driver.findElement(By.cssSelector("button#cred_sign_in_button"));
		// WebElement ele = driver.findElement(By.cssSelector("button#cred_sign_in_button"));
		  
		  //Actions action = new Actions(driver);
		  //action.moveToElement(ele);
		 // action.click().build().perform();
		
	//	driver.findElement(By.cssSelector("div.template-item-start-button-text")).click();
		
		WebElement element = driver.findElement(By.cssSelector("button#cred_sign_in_button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		executor.executeScript("arguments[0].click();",element);
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("button.template-item-start-button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.template-item-start-button"))).click();
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("button.pa__button--secondary")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.pa__button--secondary"))).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.Thread.sleep(5000);")).click();
	}

}
