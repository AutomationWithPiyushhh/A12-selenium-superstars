package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:/Users/User/git/A12-Basic-selenium/A12-selenium-superstar/src/test/java/html/fileupload.html");
		
		driver.findElement(By.id("username")).sendKeys("Kallu kaliya");
		Thread.sleep(3000);
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Jenkins.pdf");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
