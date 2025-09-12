package working_with_screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBook {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

//		Taking ss of web page
		TakesScreenshot tks = (TakesScreenshot) driver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"./errorShots/webpage.png");

		FileHandler.copy(src, dest);

//		Taking ss of web element => Login button

		WebElement facebook = driver.findElement(By.cssSelector("img[alt=\"Facebook\"]"));
		File source = facebook.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"./errorShots/webelement.png");
		FileHandler.copy(source, destination);

		System.out.println("Screenshot taken successfully!!!");

		Thread.sleep(3000);
		driver.quit();
	}
}
