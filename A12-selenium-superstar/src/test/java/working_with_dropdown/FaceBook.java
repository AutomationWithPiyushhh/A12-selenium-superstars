package working_with_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement dayDD = driver.findElement(By.id("day"));
		WebElement monthDD = driver.findElement(By.id("month"));
		WebElement yearDD = driver.findElement(By.id("year"));

		Select selDay = new Select(dayDD);
		Select selMon = new Select(monthDD);
		Select selYear = new Select(yearDD);

		selDay.selectByIndex(0);
		selMon.selectByValue("2");
		selYear.selectByVisibleText("1947");

		List<WebElement> years = selYear.getOptions();
		for (WebElement i : years) {
			System.out.println(i.getText());
		}
			
		
		Thread.sleep(3000);
		driver.quit();
	}
}
