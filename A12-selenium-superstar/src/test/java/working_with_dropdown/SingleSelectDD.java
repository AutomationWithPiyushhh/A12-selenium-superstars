package working_with_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\User\\git\\A12-Basic-selenium\\A12-selenium-superstar\\src\\test\\java\\html\\dd.html");
		
		WebElement studentsDD = driver.findElement(By.id("student"));
		
		Select selStud = new Select(studentsDD);
		
		List<WebElement> students = selStud.getOptions();
		for (WebElement i : students) {
			System.out.println(i.getText() + " value : " + i.getAttribute("value"));
		}
		
//		selStud.selectByIndex(3);
//		Thread.sleep(1000);
//		selStud.selectByValue("shekhar");
//		Thread.sleep(1000);
//		selStud.selectByVisibleText("Prince");
//		Thread.sleep(1000);
//		selStud.selectByIndex(4);
//		Thread.sleep(1000);
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
