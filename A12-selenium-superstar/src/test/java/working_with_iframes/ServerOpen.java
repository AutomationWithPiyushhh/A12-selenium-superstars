package working_with_iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ServerOpen {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(RelativeLocator
												.with(By.tagName("input"))
												.above(By.id("pass"))				
												);
		un.sendKeys("admin");
		 driver.findElement(RelativeLocator
					.with(By.tagName("button"))
					.below(By.id("pass"))				
					).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
