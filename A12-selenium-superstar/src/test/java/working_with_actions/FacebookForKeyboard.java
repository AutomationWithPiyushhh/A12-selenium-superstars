package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookForKeyboard {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Actions act = new Actions(driver);
		act.sendKeys("admin").build().perform();

//		WebElement pwd = driver.findElement(By.id("pass"));
//		act.sendKeys(pwd, "admin@123456").build().perform();

		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();

		act.sendKeys("admin@123456").build().perform();

//		One line for all the task
		act.sendKeys("admin" + Keys.TAB + "admin@123456").build().perform();
	}
}
