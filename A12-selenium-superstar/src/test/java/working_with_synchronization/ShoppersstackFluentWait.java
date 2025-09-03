package working_with_synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersstackFluentWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.shoppersstack.com/products_page/24");

		Thread.sleep(10000);
		driver.findElement(By.id("Check Delivery")).sendKeys("201301");

		WebElement checkButton = driver.findElement(By.id("Check"));

//		Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		
//		Fluent wait
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(1000));
		
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		
		wait.ignoring(ElementClickInterceptedException.class);
		
		checkButton.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
