package search_context_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

//		driver.findElement(By.linkText("Forgot password?")).click();

//		driver.findElement(By.className("_8esh")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		Thread.sleep(3000);

		driver.quit();

	}
}
