package working_with_synchronization;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class Heroku {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        // Click on Remove button
        driver.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();

        // Create FluentWait instance
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))           // total wait time
                .pollingEvery(Duration.ofSeconds(2))           // check every 2 seconds
                .ignoring(NoSuchElementException.class);       // ignore if element not found

        // Use Function to repeatedly check for the element
        WebElement verify = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                System.out.println("Checking for message element...");
                WebElement msg = driver.findElement(By.id("message"));
                if (msg.isDisplayed()) {
                    System.out.println("Message found!");
                    return msg;
                } else {
                    return null; // keep waiting
                }
            }
        });

        System.out.println("Displayed Message: " + verify.getText());
        driver.quit();
    }
}
