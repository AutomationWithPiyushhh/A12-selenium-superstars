package working_with_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bolly {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("C:\\Users\\User\\git\\A12-Basic-selenium\\A12-selenium-superstar\\src\\test\\java\\html\\dd.html");

		WebElement characterDD = driver.findElement(By.id("kalakar"));
		Select selChar = new Select(characterDD);

		
		boolean status = selChar.isMultiple();
		if (status) {
			System.out.println("given dd is multiselect");
		}else {
			System.out.println("given dd is single select");
		}
		
//		selChar.selectByIndex(5);
//		selChar.selectByIndex(11);
		List<WebElement> chars = selChar.getOptions();
		System.out.println(chars.size());

		for (int i = 5; i < chars.size(); i++) {
			selChar.selectByIndex(i);
		}

		WebElement firstSelected = selChar.getFirstSelectedOption();
		System.out.println(firstSelected.getText());

//		selChar.deselectByIndex(5);
//		selChar.deselectByIndex(11);

		selChar.deselectAll();

		List<WebElement> selected = selChar.getAllSelectedOptions();
		System.out.println(selected.size());

		for (WebElement i : selected) {
			System.out.println(i.getText());
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
