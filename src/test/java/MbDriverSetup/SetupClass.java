package MbDriverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupClass {

	public static WebDriver driver;
	public static EdgeOptions options;
	public static ChromeOptions options1;
	
	public static WebDriver edgedriver()
	{
		WebDriverManager.edgedriver().setup();
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.addArguments("disable-popup-blocking");
		//options.addArguments("headless");
		options.addArguments("disable-blink-features-AutomationControlled");
		
		driver = new EdgeDriver(options);
		driver.get("https://www.magicbricks.com/");
		return driver;
	}
	
	public static WebDriver chromedriver()
	{
		WebDriverManager.chromedriver().setup();
		options1 = new ChromeOptions();
		options1.addArguments("--start-maximized");
		options1.addArguments("incognito");
		options1.addArguments("disable-popup-blocking");
		//options1.addArguments("headless");
		options1.addArguments("disable-blink-features-AutomationControlled");
		
		driver = new ChromeDriver(options1);
		driver.get("https://www.magicbricks.com/");
		return driver;
	}
}
