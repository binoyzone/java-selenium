import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alertPopup {


    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Switch to alert
        Alert alert = driver.switchTo().alert();
        // Get the alert text
        String alertText = alert.getText();
        // Accept the alert
        alert.accept();

        driver.quit();





    }
}
