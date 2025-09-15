package working_with_javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.zomato.com/';");

		Thread.sleep(500);

		jse.executeScript("window.scrollTo(0,100);");

		Thread.sleep(500);

		jse.executeScript("window.scrollBy(0,100);");

		Thread.sleep(500);

		jse.executeScript("window.scrollBy(0,100);");

		Thread.sleep(500);

		jse.executeScript("window.scrollBy(0,100);");

		Thread.sleep(500);

		jse.executeScript("window.scrollBy(0,100);");

		Thread.sleep(500);

		jse.executeScript("window.scrollBy(0,100);");

		System.out.println(jse.executeScript("return document.title;"));
		
		driver.quit();
	}
}
