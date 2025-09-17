package working_with_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://jqueryui.com/slider/");

		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.id("slider"));

		Actions act = new Actions(driver);
		act.moveToElement(slider, 100, 0).click().build().perform();

		Thread.sleep(3000);

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		WebElement frameElement = driver.findElement(By.id("iframeResult"));

//		driver.switchTo().frame(1);		
//		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(frameElement);

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Thread.sleep(5000);
		driver.quit();

	}
}
