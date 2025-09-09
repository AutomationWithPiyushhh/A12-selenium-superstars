package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");

		WebElement forgotPwd = driver.findElement(By.xpath("//a[contains(@id,\"u_0_6_\")]"));
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(forgotPwd).build().perform();
		
		Thread.sleep(5000);
		driver.quit();	
		
	}
}
