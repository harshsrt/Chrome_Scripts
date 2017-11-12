package Chrome;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
import org.openqa.selenium.support.ui.WebDriverWait;

public class powerapps {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://test.create.powerapps.com/studio/#");
		System.out.println("Welcome to PowerApps !");
		System.out.println("Time taken by different Events and Controls");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#cred_userid_inputtext"))
				.sendKeys("user1@msprojectsienav1.onmicrosoft.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#cred_password_inputtext")).sendKeys("Building9");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#cred_keep_me_signed_in_checkbox")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#cred_sign_in_button"))).click();
		// WebElement element=
		// driver.findElement(By.cssSelector("button#cred_sign_in_button"));
		// WebElement ele =
		// driver.findElement(By.cssSelector("button#cred_sign_in_button"));

		// Actions action = new Actions(driver);
		// action.moveToElement(ele);
		// action.click().build().perform();

		// driver.findElement(By.cssSelector("div.template-item-start-button-text")).click();
		double start_splash = System.currentTimeMillis();
		WebElement element = driver.findElement(By.cssSelector("button#cred_sign_in_button"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		executor.executeScript("arguments[0].click();", element);
		double finish_splash = System.currentTimeMillis();
		double Total_Time_Splash = (finish_splash - start_splash) / 1000;
		System.out.println("Time taken to Load splash Screen :" + Total_Time_Splash + " seconds");
		// driver.findElement(By.cssSelector("button.template-item-start-button")).click();
		Thread.sleep(15000);
		double start_Home = System.currentTimeMillis();
		WebElement Tablet = driver.findElement(By.cssSelector("button#blank-app-icon-container-id-tablet"));

		Actions action_tablet = new Actions(driver);
		action_tablet.moveToElement(Tablet);
		action_tablet.click().build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.button-content-container"))).click();
		// Thread.sleep(5000);
		// driver.findElement(By.cssSelector("button.pa__button--secondary")).click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.pa__button--secondary"))).click();

		// wait.until(ExpectedConditions.titleContains("PowerApps"));
		String homepage = driver.getWindowHandle();
		// System.out.println(homepage);
		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		Iterator<String> iterator = windows.iterator();
		String currentWindowId;

		while (iterator.hasNext()) {
			currentWindowId = iterator.next().toString();
			// System.out.println(currentWindowId);

			if (!currentWindowId.equals(homepage)) {
				driver.switchTo().window(currentWindowId);
				driver.close();
				driver.switchTo().window(homepage);
			}
		}
		Thread.sleep(15000);
		double finish_Home = System.currentTimeMillis();
		double Total_Time_Home = (finish_Home - start_Home) / 1000;
		System.out.println("Time taken to Load Home page :" + Total_Time_Home + " seconds");
		// driver.switchTo().alert().dismiss();
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.pa__button--secondary"))).click();
		// Time taken by Gallery to load
		double start = System.currentTimeMillis();
		WebElement gallary = driver.findElement(By.cssSelector("div.onboardingTileTitle_lpfpz3"));

		Actions action = new Actions(driver);
		action.moveToElement(gallary);
		action.click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		double finish = System.currentTimeMillis();
		double Total_Time = (finish - start) / 1000;
		System.out.println("Time taken by Form to load :" + Total_Time + " seconds");
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder"))).sendKeys(Keys.DELETE);
		// driver.findElement(By.cssSelector("appmagic-gallery-template-item")).sendKeys(Keys.DELETE);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Time taken by Label to load
		// driver.findElement(By.cssSelector("div.appmagic-label-control")).click();
		double start_Label = System.currentTimeMillis();
		WebElement label = driver.findElement(By.cssSelector("div#appmagic-label-control.button"));

		Actions label_action = new Actions(driver);
		label_action.moveToElement(label);
		label_action.click().build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(2000);
		double finish_label = System.currentTimeMillis();
		double Total_Time_Label = (finish_label - start_Label) / 1000;
		System.out.println("Time taken by Label to load :" + Total_Time_Label + " seconds");
		double start_button = System.currentTimeMillis();
		WebElement button = driver.findElement(By.cssSelector("div#appmagic-button-control"));

		Actions button_action = new Actions(driver);
		button_action.moveToElement(button);
		button_action.click().build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(2000);
		double finish_button = System.currentTimeMillis();
		double Total_Time_button = (finish_button - start_button) / 1000;
		System.out.println("Time taken by Button to load :" + Total_Time_button + " seconds");
		double start_Data = System.currentTimeMillis();
		WebElement Data = driver.findElement(By.cssSelector("div#appmagic-dataGrid-control"));

		Actions Data_action = new Actions(driver);
		Data_action.moveToElement(Data);
		Data_action.click().build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(3000);
		double finish_Data = System.currentTimeMillis();
		double Total_Time_Data = (finish_Data - start_Data) / 1000;
		System.out.println("Time taken by Data table to load :" + Total_Time_Data + " seconds");
		double start_Gallery = System.currentTimeMillis();
		WebElement Gallery = driver.findElement(By.cssSelector("div#appmagic-galleries-group"));

		Actions Gallery_action = new Actions(driver);
		Gallery_action.moveToElement(Gallery);
		Gallery_action.click().build().perform();
		WebElement Gallery_template = driver.findElement(By.cssSelector("div#appmagic-gallery-vertical-control"));

		Actions Gallery1_action = new Actions(driver);
		Gallery1_action.moveToElement(Gallery_template);
		Gallery1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(7000);
		double finish_Gallery = System.currentTimeMillis();
		double Total_Time_Gallery = (finish_Gallery - start_Gallery) / 1000;
		System.out.println("Time taken by Gallery to load :" + Total_Time_Gallery + " seconds");
		double start_Combobox = System.currentTimeMillis();
		WebElement Combobox = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Combobox_action = new Actions(driver);
		Combobox_action.moveToElement(Combobox);
		Combobox_action.click().build().perform();
		WebElement Combobox_template = driver.findElement(By.cssSelector("div#appmagic-combobox-control"));

		Actions Combobox1_action = new Actions(driver);
		Combobox1_action.moveToElement(Combobox_template);
		Combobox1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(3000);
		double finish_Combobox = System.currentTimeMillis();
		double Total_Time_Combobox = (finish_Combobox - start_Combobox) / 1000;
		System.out.println("Time taken by Combobox to load :" + Total_Time_Combobox + " seconds");
		double start_Dropdown = System.currentTimeMillis();
		WebElement Dropdown = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Dropdown_action = new Actions(driver);
		Dropdown_action.moveToElement(Dropdown);
		Dropdown_action.click().build().perform();
		WebElement Dropdown_template = driver.findElement(By.cssSelector("div#appmagic-dropdown-control"));

		Actions Dropdown1_action = new Actions(driver);
		Dropdown1_action.moveToElement(Dropdown_template);
		Dropdown1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(2000);
		double finish_Dropdown = System.currentTimeMillis();
		double Total_Time_Dropdown = (finish_Dropdown - start_Dropdown) / 1000;
		System.out.println("Time taken by Dropdown to load :" + Total_Time_Dropdown + " seconds");
		double start_Datepicker = System.currentTimeMillis();
		WebElement Datepicker = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Datepicker_action = new Actions(driver);
		Datepicker_action.moveToElement(Datepicker);
		Datepicker_action.click().build().perform();
		WebElement Datepicker_template = driver.findElement(By.cssSelector("div#appmagic-datepicker-control"));

		Actions Datepicker1_action = new Actions(driver);
		Datepicker1_action.moveToElement(Datepicker_template);
		Datepicker1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(4000);
		double finish_Datepicker = System.currentTimeMillis();
		double Total_Time_Datepicker = (finish_Datepicker - start_Datepicker) / 1000;
		System.out.println("Time taken by Datepicker to load :" + Total_Time_Datepicker + " seconds");
		double start_Listbox = System.currentTimeMillis();
		WebElement Listbox = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Listbox_action = new Actions(driver);
		Listbox_action.moveToElement(Listbox);
		Listbox_action.click().build().perform();
		WebElement Listbox_template = driver.findElement(By.cssSelector("div#appmagic-listbox-control"));

		Actions Listbox1_action = new Actions(driver);
		Listbox1_action.moveToElement(Listbox_template);
		Listbox1_action.click().build().perform();
		Thread.sleep(3000);
		double finish_Listbox = System.currentTimeMillis();
		double Total_Time_Listbox = (finish_Listbox - start_Listbox) / 1000;
		System.out.println("Time taken by Listbox to load :" + Total_Time_Listbox + " seconds");
		double start_Checkbox = System.currentTimeMillis();
		WebElement Checkbox = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Checkbox_action = new Actions(driver);
		Checkbox_action.moveToElement(Checkbox);
		Checkbox_action.click().build().perform();
		WebElement Checkbox_template = driver.findElement(By.cssSelector("div#appmagic-checkbox-control"));

		Actions Checkbox1_action = new Actions(driver);
		Checkbox1_action.moveToElement(Checkbox_template);
		Checkbox1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(3000);
		double finish_Checkbox = System.currentTimeMillis();
		double Total_Time_Checkbox = (finish_Checkbox - start_Checkbox) / 1000;
		System.out.println("Time taken by Checkbox to load :" + Total_Time_Checkbox + " seconds");
		double start_Radio =System.currentTimeMillis();
		WebElement Radio = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Radio_action = new Actions(driver);
		Radio_action.moveToElement(Radio);
		Radio_action.click().build().perform();
		WebElement Radio_template = driver.findElement(By.cssSelector("div#appmagic-radio-control"));

		Actions Radio1_action = new Actions(driver);
		Radio1_action.moveToElement(Radio_template);
		Radio1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(3000);
		double finish_Radio = System.currentTimeMillis();
		double Total_Time_Radio = (finish_Radio - start_Radio) / 1000;
		System.out.println("Time taken by Radio button to load :" + Total_Time_Radio + " seconds");
		double start_Toggle =System.currentTimeMillis();
		WebElement Toggle = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Toggle_action = new Actions(driver);
		Toggle_action.moveToElement(Toggle);
		Toggle_action.click().build().perform();
		WebElement Toggle_template = driver.findElement(By.cssSelector("div#appmagic-toggleswitch-control"));

		Actions Toggle1_action = new Actions(driver);
		Toggle1_action.moveToElement(Toggle_template);
		Toggle1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(3000);
		double finish_toggle = System.currentTimeMillis();
		double Total_Time_Toggle = (finish_toggle - start_Toggle) / 1000;
		System.out.println("Time taken by Toggle to load :" + Total_Time_Toggle + " seconds");
		double start_Slider =System.currentTimeMillis();
		WebElement Slider = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Slider_action = new Actions(driver);
		Slider_action.moveToElement(Slider);
		Slider_action.click().build().perform();
		WebElement Slider_template = driver.findElement(By.cssSelector("div#appmagic-slider-control"));

		Actions Slider1_action = new Actions(driver);
		Slider1_action.moveToElement(Slider_template);
		Slider1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(2000);
		double finish_Slider = System.currentTimeMillis();
		double Total_Time_Slider =(finish_Slider - start_Slider)/1000;
		System.out.println("Time taken by Slider to load :" + Total_Time_Slider + " seconds");
		double start_Rating =System.currentTimeMillis();
		WebElement Rating = driver.findElement(By.cssSelector("div#appmagic-controls-group"));

		Actions Rating_action = new Actions(driver);
		Rating_action.moveToElement(Rating);
		Rating_action.click().build().perform();
		WebElement Rating_template = driver.findElement(By.cssSelector("div#appmagic-Rating-control"));

		Actions Rating1_action = new Actions(driver);
		Rating1_action.moveToElement(Rating_template);
		Rating1_action.click().build().perform();

		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.formConnectDataPlaceholder")));
		Thread.sleep(2000);
		double finish_Rating = System.currentTimeMillis();
		double Total_Time_Rating = (finish_Rating - start_Rating)/1000;
		System.out.println("Time taken by Rating to load :" + Total_Time_Rating + " seconds");
		
		
	}

}
