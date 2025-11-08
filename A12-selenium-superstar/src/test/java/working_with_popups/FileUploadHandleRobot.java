package working_with_popups;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandleRobot {
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

        driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
        Thread.sleep(2000);

        Robot robot = new Robot();
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image = robot.createScreenCapture(screenRect);
        ImageIO.write(image, "png", new File("./src/test/java/working_with_popups/Jenkins.png"));

        
        Thread.sleep(5000);
        driver.quit();
    }
}
