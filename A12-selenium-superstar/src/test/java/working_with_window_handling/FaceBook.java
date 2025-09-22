package working_with_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

//		Step 1> get the home address/Parent ID
		String PID = driver.getWindowHandle();

//		Step 2> perform the task which will open new window/s
		driver.findElement(By.linkText("Meta Pay")).click();

//		step 3> Get all the windows id/children IDs
		Set<String> IDs = driver.getWindowHandles();

//		Step 4> Switch to particular window
		for (String i : IDs) {
			driver.switchTo().window(i);

			Thread.sleep(5000);

			if (driver.getTitle().contains("Meta")) {

//		Step 5> perform the task
				Thread.sleep(1000);
				driver.close();
				break;
			}
		}

//		Step 6> come back to home/Parent page
//		driver.switchTo().window(PID);

		Thread.sleep(5000);
		driver.close();
	}
}
