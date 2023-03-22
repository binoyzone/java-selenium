import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class switch_Frame {

    public static void main(String[] args)
        {

            WebDriver driver = new ChromeDriver();
            driver.get("https://example.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            // Find the frame element
            WebElement frameElement = driver.findElement(By.id("frame-id"));
            // Switch to the frame
            driver.switchTo().frame(frameElement);
            // Perform actions inside the frame
            driver.findElement(By.id("textbox-id")).sendKeys("some text");
            // Switch back to the default content
            driver.switchTo().defaultContent();

            driver.quit();
    }
}
