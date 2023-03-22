import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragAndDrop {

    public static void main(String[] args) {




        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Find the source and target elements
        WebElement sourceElement = driver.findElement(By.id("source"));
        WebElement targetElement = driver.findElement(By.id("target"));
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);
        // Perform drag and drop operation
        actions.dragAndDrop(sourceElement, targetElement).perform();

        driver.quit();



    }
}
