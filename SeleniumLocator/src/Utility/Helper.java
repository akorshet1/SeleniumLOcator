package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Helper {

	public static WebDriver startBrowser(String browser) {
		
		WebDriver driver =null;
		if(browser.equalsIgnoreCase("Chrome")|| browser.equalsIgnoreCase("GC")|| browser.equalsIgnoreCase("Google Chrome")){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AN20307097\\OneDrive - Wipro\\Desktop\\Screenshot\\chromedriver.exe");
		driver=new ChromeDriver();
	}
		else if(browser.equalsIgnoreCase("Chrome")|| browser.equalsIgnoreCase("GC")|| browser.equalsIgnoreCase("Microsoft Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\SeleniumJarsChromedriver\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}else {
			System.out.println("Sorry we do not Support this browser");
		}
		
		return driver;
}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	

}
