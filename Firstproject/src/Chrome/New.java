package Chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		driver.get("https://www.msn.com/en-us/");
   		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   		Robot robot = new Robot();
   		robot.keyPress(KeyEvent.VK_F12);
   		robot.keyRelease(KeyEvent.VK_F12);	
   	 }

}
