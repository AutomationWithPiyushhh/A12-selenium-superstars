package working_with_popups;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadIgnore {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

        driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\git\\A12-Basic-selenium\\A12-selenium-superstar\\src\\test\\java\\working_with_popups\\Jenkins.pdf");
        
        System.out.println("File uploaded successfully!");

        Thread.sleep(5000);
        driver.quit();
    }
}
