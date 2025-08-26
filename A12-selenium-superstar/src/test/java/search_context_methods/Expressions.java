package search_context_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expressions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid='royal-pass']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		
		Thread.sleep(10000);
		driver.quit();
	}
}
