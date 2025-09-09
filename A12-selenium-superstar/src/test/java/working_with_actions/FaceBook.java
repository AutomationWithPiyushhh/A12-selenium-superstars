package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement link = driver.findElement(By.linkText("Create a Page"));

		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
//		act.moveToElement(link).build().perform();

		act.contextClick(link).build().perform();
		
		Thread.sleep(10000);
		driver.quit();

	}
}
