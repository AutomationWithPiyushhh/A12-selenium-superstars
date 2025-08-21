package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstLine {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//				driver = new EdgeDriver();
//				driver = new FirefoxDriver();
		
		driver.get("https://www.swiggy.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		System.out.println(driver.getPageSource());
		
	}
}
