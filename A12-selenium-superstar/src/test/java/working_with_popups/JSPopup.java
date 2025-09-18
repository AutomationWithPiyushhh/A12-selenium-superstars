package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		Thread.sleep(2000);  

		driver.switchTo().alert().accept();
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert ale = driver.switchTo().alert();
		
		ale.sendKeys("Dinga");
		ale.accept();
			
		Thread.sleep(2000);
//		driver.quit();
	}
}
