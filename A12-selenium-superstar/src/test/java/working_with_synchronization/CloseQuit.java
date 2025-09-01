package working_with_synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.close();
		driver.close();
	}
}
