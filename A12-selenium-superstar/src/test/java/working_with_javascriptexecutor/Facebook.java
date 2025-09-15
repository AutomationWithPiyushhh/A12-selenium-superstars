package working_with_javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.facebook.com/';");

		WebElement un = driver.findElement(By.id("email"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		WebElement cna = driver.findElement(By.linkText("Create new account"));

		String username = "admin";
//		un.sendKeys(username);

//		cna.click();

//		jse.executeScript("arguments[0].click();",loginBtn);

		jse.executeScript("arguments[0].click();",cna);

//		jse.executeScript("arguments[0].value='admin';", un);
//		jse.executeScript("arguments[0].value=arguments[1];", un, username);

//		click() => click()
//		sendKeys() => value=''

//		driver.findElement(By.xpath("//label[text()='Custom']")).click();
//		Thread.sleep(3000);
		
		WebElement cg = driver.findElement(By.id("custom_gender"));
//		cg.sendKeys("Male");
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
