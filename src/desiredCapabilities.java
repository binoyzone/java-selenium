import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class desiredCapabilities {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();
        // Click on a link that opens a new window
        driver.findElement(By.linkText("Click here to open a new window")).click();
        // Switch to the newly opened window
        for(String windowHandle : driver.getWindowHandles()) {
            if(!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        // Check the title of the new window/tab
        if(driver.getTitle().equals("New window"))
        {
            System.out.println("New window is opened");
        }
        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);

        driver.quit();
    }
}
