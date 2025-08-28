package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement login = driver.findElement(By.name("login"));
		
		un.sendKeys("1234567");
		Thread.sleep(1000);
		un.clear();
		

		if (login.isDisplayed() && login.isEnabled()) {
//			login.click();
		}
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/input"));
		if (maleRadio.isDisplayed() && maleRadio.isEnabled()) {
			System.out.println(maleRadio.isSelected());
			maleRadio.click();
			System.out.println(maleRadio.isSelected());
		}
		
		
//		System.out.println(maleRadio.getSize());
//		System.out.println(maleRadio.getLocation());
		
		System.out.println(maleRadio.getRect().getDimension());
		System.out.println(maleRadio.getRect().getPoint());
		System.out.println(maleRadio.getRect().getHeight());
		System.out.println(maleRadio.getRect().getWidth());
		System.out.println(maleRadio.getRect().getX());
		System.out.println(maleRadio.getRect().getY());
		
		//		login.submit();
		
		
		
		
//		System.out.println(un.getAttribute("data-testid"));
//		String fontSize = un.getCssValue("font-size");
//		System.out.println(fontSize);
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
