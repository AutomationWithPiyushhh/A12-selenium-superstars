package manage_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Window win = driver.manage().window();

//		win.maximize();
//
//		Thread.sleep(1000);
//
//		win.minimize(); 
//
//		Thread.sleep(1000);
//
//		win.fullscreen();

	
		Dimension dim = win.getSize();
		System.out.println(dim);
		
		int h = dim.getHeight();
		int w = dim.getWidth();
//		
//		System.out.println("height is : " + h);
//		System.out.println("width is : " + w);
		
//		Dimension dim2 = new Dimension(1350, 800);
//		win.setSize(dim2);
//		
//		Thread.sleep(2000);
//		win.setSize(dim);
		
		
		Point pt = win.getPosition();
		System.out.println(pt);
		
		driver.manage().window().maximize();
		System.out.println("The size of window in width and lenght : "+win.getSize());
		
		pt = win.getPosition();

		System.out.println(pt);

		Point pt2 = new Point(w/2, h/2);
		
		win.setPosition(pt2);
		
		Thread.sleep(7000);
		driver.quit();
	}
}
