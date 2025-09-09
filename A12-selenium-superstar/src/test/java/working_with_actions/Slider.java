package working_with_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		Actions act = new Actions(driver);
//		act.moveToElement(slider).click().moveByOffset(50, 0).build().perform();
//		act.moveToElement(slider, 50, 0).click().build().perform();
		act.contextClick().build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
