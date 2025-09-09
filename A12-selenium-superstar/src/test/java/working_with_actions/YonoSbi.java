package working_with_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YonoSbi {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://yonobusiness.sbi/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		WebElement eyeIcon = driver.findElement(By.cssSelector("img[src=\"assets/img/Revamp/icon_eye_close.svg\"]"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(eyeIcon).build().perform();
		
		Thread.sleep(3000);
		act.release().build().perform();
		
		Thread.sleep(10000);
		driver.quit();

	}
}
