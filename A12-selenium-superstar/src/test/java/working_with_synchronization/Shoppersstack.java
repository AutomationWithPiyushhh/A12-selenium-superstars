package working_with_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.shoppersstack.com/products_page/24");

		Thread.sleep(10000);
		driver.findElement(By.id("Check Delivery")).sendKeys("201301");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement checkButton = driver.findElement(By.id("Check"));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
//		wait.until(ExpectedConditions.elementToBeClickable(checkButton));

		checkButton.click();
		Thread.sleep(5000);
		driver.quit();
	}
}
