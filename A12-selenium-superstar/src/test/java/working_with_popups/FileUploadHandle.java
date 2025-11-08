package working_with_popups;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandle {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

        driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
        Thread.sleep(2000);

        // Step 1: Click on the "Upload Resume" button
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();

        // Step 2: Run AutoIt script to handle popup
        Runtime.getRuntime().exec("./src/test/resources/uploadFile.exe");

        System.out.println("File uploaded successfully!");

        Thread.sleep(5000);
        driver.quit();
    }
}
