package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalsQA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

//		driver.switchTo().frame(0);
		driver.switchTo().frame(3);

		WebElement src1 = driver.findElement(By.cssSelector("img[alt='The peaks of High Tatras']"));
		WebElement src2 = driver.findElement(By.cssSelector("img[alt='The chalet at the Green mountain lake']"));
		WebElement src3 = driver.findElement(By.cssSelector("img[alt='Planning the ascent']"));
		WebElement src4 = driver.findElement(By.cssSelector("img[alt='On top of Kozi kopka']"));
		WebElement destination = driver.findElement(By.id("trash"));

		int x1 = src1.getLocation().getX();
		int y1 = src1.getLocation().getY();

		int x2 = destination.getLocation().getX();
		int y2 = destination.getLocation().getY();

		System.out.println(src1.getLocation());
		System.out.println(destination.getLocation());
		
		System.out.println(x2-x1);
		System.out.println(y2-y1);
		Actions act = new Actions(driver);
		
//		dragAndDrop(src,dest)
//		act.dragAndDrop(src1, destination).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(src2, destination).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(src3, destination).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(src4, destination).build().perform();

//		dragAndDrop(src,dest)
		act.dragAndDropBy(src1, 442,31).build().perform();
		Thread.sleep(1000);
		act.dragAndDropBy(src2, 442,31).build().perform();
		Thread.sleep(1000);
		act.dragAndDropBy(src3, 442,31).build().perform();
		Thread.sleep(1000);
		act.dragAndDropBy(src4, 442,31).build().perform();

		Thread.sleep(5000);
		driver.quit();

	}
}
