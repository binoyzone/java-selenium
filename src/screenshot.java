import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class screenshot {

    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Take a screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            // Save the screenshot to a file
            FileHandler.copy(screenshotFile, new File("path/to/screenshot.png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        driver.close();
        driver.quit();





    }
}
