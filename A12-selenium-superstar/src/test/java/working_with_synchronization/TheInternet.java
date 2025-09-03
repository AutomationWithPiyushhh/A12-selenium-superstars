package working_with_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheInternet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		
//		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
