package search_context_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("");

		By by = By.id("email");

		WebElement un = driver.findElement(by);

		un.sendKeys("1234567890");

	}
}
